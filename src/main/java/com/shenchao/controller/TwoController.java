package com.shenchao.controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shenchao on 2017/1/3.
 */
public class TwoController implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getSession().setAttribute("hello", "沈超");
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
