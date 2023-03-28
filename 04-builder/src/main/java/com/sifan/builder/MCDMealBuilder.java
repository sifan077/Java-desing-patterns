package com.sifan.builder;

import com.sifan.product.Meal;

public class MCDMealBuilder implements MealBuilder {

    private Meal meal;

    public MCDMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildDrink() {
        System.out.println("=========薯条=======");
        meal.setFood("薯条");
    }

    @Override
    public void buildFood() {
        System.out.println("==========雪碧===========");
        meal.setDrink("雪碧");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
