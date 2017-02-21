package com.shenchao.controller;

import com.shenchao.domain.User;
import com.shenchao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by shenchao on 2017/1/3.
 */
@Controller
@RequestMapping("/user")
@SessionAttributes(value = {"user"})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    @ResponseBody
    public String addUser(User user) {
        userService.saveUser(user);
        return "添加成功";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(User user) {
        userService.updateUser(user);
        return "更新成功";
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "删除成功";
    }
    @RequestMapping("/query/{id}")
    @ResponseBody
    public User query(@PathVariable Integer id) {
        return userService.selectUserById(id);
    }
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<User> queryAll() {
        return userService.selectUsers();
    }

    @RequestMapping("/testSession")
    public String testSession(Map<String ,Object> map){
        User user = new User();
        user.setSex('你');
        user.setName("沈超");
        user.setId(1);
        map.put("user", user);
        return "success";
    }

    public String getUser(@RequestParam(value = "id", required = false) Integer id) {
        if (id != null) {
            User user = new User(1, "你那奋斗", '你');
            System.out.println("从数据库中获得一个对象：" + user);
        }
        return "";
    }
}
