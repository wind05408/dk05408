package com.data.annotation;

import java.lang.reflect.Method;

/**
 * @author dk
 * @date 2016/6/22
 */
public class AnalysisAnnotation {
    public static void main(String[] args) throws Exception {
        //Annotation其实是一种接口。通过Java的反射机制相关的API来访问annotation信息
        Class rt_class = Class.forName("com.data.annotation.Utility");
        Method[] methods = rt_class.getMethods();
        boolean flag = rt_class.isAnnotationPresent(Description.class);
        if(flag){
            Description description = (Description) rt_class.getAnnotation(Description.class);
            System.out.println("Utility's description-->"+description.value());
            for (Method method:methods){
                if(method.isAnnotationPresent(Author.class)){
                    //method invoke
                    Object object = method.invoke(rt_class.newInstance());
                    System.out.println("method invoke result-->"+object);
                    Author author = method.getAnnotation(Author.class);
                    System.out.println("Utility's Author--->"+author.name()+" from "+author.group());
                }
            }

        }


    }
}
