package com.sifan.builder;

import com.sifan.product.Meal;

/**
 * 麦当劳套餐构建器
 */
public class MCDMealBuilder implements MealBuilder {

    private Meal.Builder builder;

    public MCDMealBuilder() {
        builder = Meal.builder();
    }

    @Override
    public void buildDrink() {
        System.out.println("=========薯条=======");
        builder.food("薯条");
    }

    @Override
    public void buildFood() {
        System.out.println("==========雪碧===========");
        builder.drink("雪碧");
    }

    @Override
    public Meal getMeal() {
        return builder.build();
    }
}
