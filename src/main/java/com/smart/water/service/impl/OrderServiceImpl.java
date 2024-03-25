package com.smart.water.service.impl;

import com.smart.water.dao.OrderMapper;
import com.smart.water.entity.Order;
import com.smart.water.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Override
    public int insertOrder(){
        return orderMapper.insertOrder();
    }
    @Override
    public int deleteOrder(int id) {
        return orderMapper.deleteOrder(id);
    }
    @Override
    public void updateOrder(){
    }
    @Override
    public List<Order> getAllOrder(){
        return orderMapper.getAllOrder();
    }
    @Override
    public Order getOrderById(int id){
        return orderMapper.getOrderById(id);
    }
    @Override
    public List<Order> getOrderByBuyer(String buyer){
        return orderMapper.getOrderByBuyer(buyer);
    }
}
