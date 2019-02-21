package com.baizhi.springboot.service.impl;

import com.baizhi.springboot.dao.UserDao;
import com.baizhi.springboot.entity.User;
import com.baizhi.springboot.service.Userservice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements Userservice {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAll() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("name","zhang3");
        List<User> users = userDao.selectList(queryWrapper);
        return users;
    }
}
