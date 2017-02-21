package com.shenchao.controller;

import com.shenchao.domain.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shenchao on 2017/1/3.
 */
@Controller
public class ThreeController{
    @RequestMapping("/helloa.do")
    public String sayHello(User user,Model model){
        model.addAttribute("hello", "哈哈a");
        System.out.println(user);
        System.out.println("threeController....");
        return "hello";
    }
    @RequestMapping("/hellob.do")
    @ResponseBody
    public User sayHello1(User user){
        System.out.println("sayHello1.....");
        return  user;
    }


    @RequestMapping("/aaa.do")
    public String index() {
        return "aaa";
    }

    @RequestMapping(value = "/mutiview",produces = MediaType.APPLICATION_XML_VALUE)
    public User mutiview(){
        User u = new User();
        u.setId(23);
        u.setName("沈超");
        u.setSex('男');
        return u;
    }
}
