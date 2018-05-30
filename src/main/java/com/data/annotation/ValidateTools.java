package com.data.annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dk
 * @date 2016/3/30
 */
public class ValidateTools {

    public static Map<String, List<String>> validate(IRequest req) {

        Map<String, List<String>> errors = new HashMap<String, List<String>>();

        Field[] fields = req.getClass().getDeclaredFields();

        List<String> requiredList = new ArrayList<String>();
        List<String> lengthList = new ArrayList<String>();
        List<String> numberList = new ArrayList<String>();

        errorInfo(req, fields, requiredList, lengthList, numberList);

        // 父类字段
        if (req.getClass().getGenericSuperclass() != null) {
            Class<?> superClass = req.getClass().getSuperclass();// 父类
            Field[] superFields = superClass.getDeclaredFields();//父类字段
            errorInfo(req, superFields, requiredList, lengthList, numberList);
        }
        errors.put("REQUIRED_FIELD_NOT_EXIST", requiredList); //必填字段未填
        errors.put("FIELD_LENGTH_EXCEEDS_LIMIT", lengthList); //字段长度超过限制
        errors.put("FIELD_TYPE_ERROR", numberList); //字段类型错误
        return errors;

    }

    private static String getValue(String field, IRequest req) {
        String result = null;
        String getMethodName = "get" + toFirstLetterUpperCase(field);
        try {
            result = (String) req.getClass().getMethod(getMethodName).invoke(req);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    private static boolean isNull(String field, IRequest req) {
        boolean result = false;

        if (isBlank(getValue(field, req))) {
            result = true;
        }

        return result;
    }

    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if(cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if(!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }





    private static boolean length(String field, IRequest req, int maxLength) {
        boolean result = false;
        String value = getValue(field, req);

        if (value != null && value.length() > maxLength) {
            result = true;
        }

        return result;
    }

    private static boolean number(String field, IRequest req) {
        boolean result = false;
        String value = getValue(field, req);

        if (value != null) {
            result = Tools.isNumber(value);
        }

        return result;
    }

    private static boolean numberNoZero(String field, IRequest req) {
        boolean result = false;
        String value = getValue(field, req);

        if (value != null) {
            result = Tools.isNumberNoZero(value);
        }

        return result;
    }

    private static boolean dateTime(String field, IRequest req) {
        boolean result = false;
        String value = getValue(field, req);

        if (value != null) {
            result = Tools.isDateTime(value);
        }

        return result;
    }

    private static boolean integer(String field, IRequest req) {
        boolean result = false;
        String value = getValue(field, req);

        if (value != null) {
            result = Tools.isInt(value);
        }

        return result;
    }

    public static String toFirstLetterUpperCase(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        String firstLetter = str.substring(0, 1).toUpperCase();
        return firstLetter + str.substring(1, str.length());
    }

    private static void errorInfo(IRequest req, Field[] fields, List<String> requiredList,
                                  List<String> lengthList, List<String> numberList) {
        for (Field field : fields) {
            if (field.isAnnotationPresent(Validate.class)) {//只处理包含注解为Validate的属性名称
                Validate validateUtil = field.getAnnotation(Validate.class);

                if (validateUtil.required() == true)
                    if (true == isNull(field.getName(), req)) {
                        requiredList.add(validateUtil.name());
                    }
                if (isBlank(getValue(field.getName(), req))) {
                    continue; // 没有数据的字段，跳过长度和数字的检查
                }
                ValidateTypeKind type = validateUtil.type();
                if (ValidateTypeKind.Length == type) {
                    if (true == length(field.getName(), req, validateUtil.maxLength())) {
                        lengthList.add(validateUtil.name());
                    }
                }
                if (ValidateTypeKind.Number == type) {
                    if (true == length(field.getName(), req, validateUtil.maxLength())) {
                        // 数字也要检查长度
                        lengthList.add(validateUtil.name());
                    }
                    // 如果是必填的，不能是0, 0.00, 0.0
                    if (validateUtil.required() == true) {
                        if (!numberNoZero(field.getName(), req)) {
                            numberList.add(validateUtil.name());
                        }
                    } else {
                        if (!number(field.getName(), req)) {
                            numberList.add(validateUtil.name());
                        }
                    }
                }

                if (ValidateTypeKind.Date == type) {
                    if (true == length(field.getName(), req, validateUtil.maxLength())) {
                        // 数字也要检查长度
                        lengthList.add(validateUtil.name());
                    }
                    if (!dateTime(field.getName(), req)) {
                        numberList.add(validateUtil.name());
                    }
                }

                if (ValidateTypeKind.Integer == type) {
                    if (true == length(field.getName(), req, validateUtil.maxLength())) {
                        // 数字也要检查长度
                        lengthList.add(validateUtil.name());
                    }
                    if (!integer(field.getName(), req)) {
                        numberList.add(validateUtil.name());
                    }
                    // 如果是必填的，不能是0
//                    if (validateUtil.required() == true) {
//                        Money zero = new Money();
//                        Money data = new Money(getValue(field.getName(), req));
//                        if (!data.greaterThan(zero)) {
//                            requiredList.add(validateUtil.name());
//                        }
//                    }
                }

            }
        }
    }



}
