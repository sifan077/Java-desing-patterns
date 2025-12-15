package com.sifan.product;

/**
 * 套餐类 - 不可变对象，使用构建器模式构建
 *
 * @author 思凡
 */
public final class Meal {
    private final String food;
    private final String drink;

    private Meal(Builder builder) {
        this.food = builder.food;
        this.drink = builder.drink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    /**
     * 套餐构建器
     */
    public static class Builder {
        private String food;
        private String drink;

        private Builder() {
        }

        public Builder food(String food) {
            this.food = food;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Meal build() {
            if (food == null || drink == null) {
                throw new IllegalStateException("Food and drink must be provided");
            }
            return new Meal(this);
        }
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}

