package com.sifan.builder;

import com.sifan.product.Meal;

public class KFCMealBuilder implements MealBuilder {
    private Meal meal;

    public KFCMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
        System.out.println("=========可乐============");
    }

    @Override
    public void buildFood() {
        meal.setFood("汉堡");
        System.out.println("=========汉堡============");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
