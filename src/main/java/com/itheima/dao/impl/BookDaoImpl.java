package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("bookDao")
@PropertySource("classpath:jdbc.properties")
public class BookDaoImpl implements BookDao {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    public void save() {
        System.out.println("book dao running..." + username + password);
    }
}
