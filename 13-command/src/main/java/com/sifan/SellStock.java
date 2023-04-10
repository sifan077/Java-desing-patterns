package com.sifan;

/**
 * 出售股票
 *
 * @author 思凡
 * @date 2023/04/10
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public String execute() {
        return
                abcStock.sell();
    }
}