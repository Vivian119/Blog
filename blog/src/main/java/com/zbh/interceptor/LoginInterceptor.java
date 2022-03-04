package com.zbh.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {
//public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        //当访问其他 admin 页面且没有登录时，就重定向到登陆界面
        if (request.getSession().getAttribute("user") == null){
            System.out.println("请求被拦截");
            response.sendRedirect("/admin");
            return false;
        }
        return true;
    }
}
