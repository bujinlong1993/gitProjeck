package net.wanho.fmk.service.impl;

import net.wanho.fmk.mapper.UserMapper;
import net.wanho.fmk.pojo.User;
import net.wanho.fmk.service.UserService;

public class UserServiceImpl implements UserService {

    UserMapper userMapper;

    @Override
    public String test() {
        User user  = new User();
        return userMapper.test();
    }
}
