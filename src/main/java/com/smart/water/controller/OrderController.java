package com.smart.water.controller;

import com.smart.water.vo.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class OrderController {
    @GetMapping("/delete/{id}")
    public ResultVo deleteOrder(@PathVariable int id){
        return ResultVo.success(deleteOrder(id));
    }
}
