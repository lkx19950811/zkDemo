package com.example.zkApi;

import java.io.Serializable;

/**
 * @Author: lkx
 * @Date: create in 17:14 2019/8/13
 */
public class UserDao implements Serializable {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
