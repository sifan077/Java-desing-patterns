package com.sifan;

/**
 * 买股票
 *
 * @author 思凡
 * @date 2023/04/10
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public String execute() {
        return abcStock.buy();
    }
}