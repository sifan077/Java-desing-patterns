package com.sifan;

/**
 * 股票操作
 *
 * @author 思凡
 * @date 2023/04/10
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public String buy() {
        return
                "Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought";
    }

    public String sell() {
        return "Stock [ Name: " + name + ", Quantity:" + quantity + " ] sold ";
    }
}