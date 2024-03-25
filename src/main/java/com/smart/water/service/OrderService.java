package com.smart.water.service;

import com.smart.water.entity.Order;

import java.util.List;

public interface OrderService {
    int insertOrder();
    int deleteOrder(int id);
    void updateOrder();
    List<Order> getAllOrder();
    Order getOrderById(int id);
    List<Order> getOrderByBuyer(String buyer);
}
