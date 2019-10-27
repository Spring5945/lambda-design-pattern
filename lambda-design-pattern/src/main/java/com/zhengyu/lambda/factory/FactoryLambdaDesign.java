package com.zhengyu.lambda.factory;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.Map;
import java.util.function.Supplier;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class FactoryLambdaDesign {
    private FactoryLambdaDesign() {
    }

    private static final Map<String, Supplier<Fruit>> map = Maps.newHashMapWithExpectedSize(16);

    static {
        map.put("apple", Apple::new);
        map.put("orange", Orange::new);
    }


    public static Fruit create(String fruitName) {

        Supplier<Fruit> fruitSupplier = map.get(fruitName);
        Preconditions.checkArgument(fruitSupplier != null, "No such fruit");
        return fruitSupplier.get();

    }
}
