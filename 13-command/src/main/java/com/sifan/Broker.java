package com.sifan;

import java.util.ArrayList;
import java.util.List;

/**
 * 代理
 *
 * @author 思凡
 * @date 2023/04/10
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    /**
     * 下订单
     */
    public List<String> placeOrders() {
        List<String> res = new ArrayList<>();
        for (Order order : orderList) {
            res.add(order.execute());
        }
        orderList.clear();
        return res;
    }
}