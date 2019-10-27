package com.zhengyu.lambda.strategy;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class StrategyTest {
    public static void main(String[] args) {
        Validator.validate("helloworld", s -> s.length() > 2);
        Validator.validate("helloworld", s -> "hello".equals(s));
    }
}
