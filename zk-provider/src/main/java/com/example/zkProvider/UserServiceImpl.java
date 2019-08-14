package com.example.zkProvider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.zkApi.UserDao;
import com.example.zkApi.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lkx
 * @Date: create in 17:24 2019/8/13
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Override
    public UserDao findByName(String name) {
        UserDao userDao = new UserDao();
        userDao.setName(name);
        userDao.setAddress("敦煌洞窟");
        return userDao;
    }

    @Override
    public List<UserDao> findAll() {
        UserDao userDao = new UserDao();
        userDao.setName("123");
        userDao.setAddress("不知道是哪里的鬼地方");
        List<UserDao> list = new ArrayList<>();
        list.add(userDao);
        return list;
    }
}
