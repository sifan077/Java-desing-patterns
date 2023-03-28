package com.sifan.director;

import com.sifan.builder.MealBuilder;
import com.sifan.product.Meal;

public class Waiter {

    private MealBuilder mealBuilder;

    public Waiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
}
