package com.smart.water.dao;

import com.smart.water.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    /*1、映射文件的namespace要和mapper接口的全类名保持一致
    * 2、映射文件中sql语句的id要和mapper接口中的方法名一致
    * 3、*/

    /**
     * 添加订单信息
     */
    int insertOrder();

    /**
     * 修改
     */
    void updateOrder();

    /**
     * 删除
     */
    int deleteOrder(int id);

    /**
     * 查询
     */
    Order getOrderById(int id);
    List<Order> getAllOrder();
    List<Order> getOrderByBuyer(String buyer);
}
