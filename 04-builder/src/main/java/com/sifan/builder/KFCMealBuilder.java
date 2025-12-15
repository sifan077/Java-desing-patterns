package com.sifan.builder;

import com.sifan.product.Meal;

/**
 * 肯德基套餐构建器
 */
public class KFCMealBuilder implements MealBuilder {
    private Meal.Builder builder;

    public KFCMealBuilder() {
        builder = Meal.builder();
    }

    @Override
    public void buildDrink() {
        builder.drink("可乐");
        System.out.println("=========可乐============");
    }

    @Override
    public void buildFood() {
        builder.food("汉堡");
        System.out.println("=========汉堡============");
    }

    @Override
    public Meal getMeal() {
        return builder.build();
    }
}
