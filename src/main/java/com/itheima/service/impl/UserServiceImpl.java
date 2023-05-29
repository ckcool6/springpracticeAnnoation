package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Value("3")
    private int num;

    @Value("itheima")
    private String version;

    @Autowired
    private UserDao userDao;

    /*
       public void setNum(int num) {
       this.num = num;
    }

    public void setVersion(String version) {
        this.version = version;
    }*/

    public void save() {
        System.out.println("user service running..." + num + version);
        userDao.save();

    }

    @PostConstruct
    public void init() {
        System.out.println("user servier init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("user servier destroy...");
    }

}
