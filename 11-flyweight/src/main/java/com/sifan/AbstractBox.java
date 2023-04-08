package com.sifan;

public abstract class AbstractBox {
    public abstract String getShape();

    public String display(String color) {
        return "方块形状：" + this.getShape() + " 颜色：" + color;
    }
}
