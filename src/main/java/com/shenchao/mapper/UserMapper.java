package com.shenchao.mapper;

import com.shenchao.domain.User;

import java.util.List;

/**
 * Created by shenchao on 2017/1/3.
 */
public interface UserMapper {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);

    User selectUserById(Integer id);

    List<User> selectUsers();
}
