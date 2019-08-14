package com.example.zkApi;

import com.example.zkApi.UserDao;

import java.util.List;

/**
 * @Author: lkx
 * @Date: create in 17:15 2019/8/13
 */
public interface UserService {
    /**
     * 根据姓名查找
     * @param name 名字
     * @return user
     */
    public UserDao findByName(String name);

    /**
     *
     * @return 所有user
     */
    public List<UserDao> findAll();
}
