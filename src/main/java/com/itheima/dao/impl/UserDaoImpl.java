package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("dao running...");
    }

    public void save() {
        System.out.println("user dao running...");
    }
}
