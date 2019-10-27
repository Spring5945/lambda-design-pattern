package com.zhengyu.lambda.strategy;

import java.util.function.Predicate;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class Validator {
    private Validator() {
    }

    public static boolean validate(String str, Predicate<String> validateFunc) {
        return validateFunc.test(str);
    }
}
