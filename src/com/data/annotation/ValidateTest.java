package com.data.annotation;

/**
 * @author dk
 * @date 2016/3/30
 */
public class ValidateTest {
    @Validate(type = ValidateTypeKind.Length, name = "name", maxLength = 5, required = true)
    private String name;

    @Validate(type = ValidateTypeKind.Number, name = "½ð¶î", maxLength = 12, required = true)
    private String amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
