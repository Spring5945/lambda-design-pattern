package com.zhengyu.lambda.template;

import java.util.StringJoiner;
import java.util.function.Consumer;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class AbstractTemplate {

    public void templateMethod(String name, Consumer<String> consumer) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add(name);
        stringJoiner.add("world");
        consumer.accept(stringJoiner.toString());
    }
}
