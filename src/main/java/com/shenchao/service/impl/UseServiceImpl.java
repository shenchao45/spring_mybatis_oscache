package com.shenchao.service.impl;

import com.shenchao.domain.User;
import com.shenchao.mapper.UserMapper;
import com.shenchao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shenchao on 2017/1/3.
 */
@Service
public class UseServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<User> selectUsers() {
        return userMapper.selectUsers();
    }
}
