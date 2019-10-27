package com.zhengyu.lambda.template;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class TemplateTest {
    public static void main(String[] args) {
        new AbstractTemplate().templateMethod("hello", s -> System.out.println(s));
    }
}
