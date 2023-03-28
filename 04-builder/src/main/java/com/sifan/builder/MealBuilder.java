package com.sifan.builder;

import com.sifan.product.Meal;

public interface MealBuilder {
    void buildDrink();

    void buildFood();

    Meal getMeal();
}
