package com.design.template.demo1;

/**
 * TemplateClient
 *
 * @author dk
 * @date 2016/11/24
 */
public class TemplateClient {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
    }
}
