package com.zhengyu.lambda.factory;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class FactoryDesign {
    private FactoryDesign() {
    }

    public static Fruit create(String fruitName) {
        switch (fruitName) {
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            default:
                throw new RuntimeException("xxx");
        }
    }
}
