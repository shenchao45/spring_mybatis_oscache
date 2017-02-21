package com.shenchao.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Created by shenchao on 2017/1/3.
 */
public class OneController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("hello world");
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/jsp/hello.jsp");
        modelAndView.addObject("hello", "wzh");
        return modelAndView;
    }
}
