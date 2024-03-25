package com.smart.water.service.impl;

import com.smart.water.dao.BlogMapper;
import com.smart.water.entity.Blog;
import com.smart.water.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogMapper blogMapper;

    @Override
    public int delete(int id) {
        return blogMapper.delete(id);
    }

    @Override
    public List<Blog> getAllByAuthorAndTime(String author, String time) {
        return blogMapper.getAllByAuthorAndTime(author,time);
    }
}
