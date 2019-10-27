package com.zhengyu.lambda.factory;

import sun.jvm.hotspot.utilities.Assert;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class FactoryTest {
    public static void main(String[] args) {
        Fruit lambdaApple = createLambdaTest("apple");
        Fruit apple = createTest("apple");
        Assert.that(apple!=null,"");
        Assert.that(lambdaApple!=null,"");
    }

    private static Fruit createTest(String fruitName) {
        return FactoryDesign.create(fruitName);
    }

    private static Fruit createLambdaTest(String fruitName) {
        return FactoryLambdaDesign.create(fruitName);
    }


}
