package com.zhengyu.lambda.function;

import com.google.common.base.Preconditions;

import java.util.function.Function;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class FunctionTest {
    public static void main(String[] args) {

        Preconditions.checkArgument(
                "HELLOWORLD10".equals(
                        appendFunc().andThen(lengthAppendFunc()).andThen(toUpperCaseFunc())
                                .apply("hello")
                ), "function is running bad");

    }

    private static Function<String, String> appendFunc() {
        return s -> s + "world";
    }

    private static Function<String, String> lengthAppendFunc() {
        return s -> s + s.length();
    }

    private static Function<String, String> toUpperCaseFunc() {
        return s -> s.toUpperCase();
    }
}
