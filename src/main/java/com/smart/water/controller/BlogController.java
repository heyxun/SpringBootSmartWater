package com.smart.water.controller;

import com.smart.water.service.BlogService;
import com.smart.water.vo.ResultVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Resource
    private BlogService blogService;

    @GetMapping("/delete/{id}")
    public ResultVo delete(@PathVariable int id){
        return ResultVo.success(blogService.delete(id));
    }

    @GetMapping("get/{author}")
    public ResultVo getAllByAuthorAndTime(@PathVariable String author){
        return ResultVo.success();
    }
}
