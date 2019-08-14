package com.example.zkConsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.zkApi.UserDao;
import com.example.zkApi.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: lkx
 * @Date: create in 17:48 2019/8/13
 */
@RestController
public class HelloController {
    @Reference
    UserService userService;

    @GetMapping("findByName")
    public UserDao findByName(String name){
        return userService.findByName(name);
    }
    @GetMapping("list")
    public List<UserDao> findAll(){
        return userService.findAll();
    }
}
