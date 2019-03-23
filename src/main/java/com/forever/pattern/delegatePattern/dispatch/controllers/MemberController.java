package com.forever.pattern.delegatePattern.dispatch.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberController {

    public void regist(HttpServletRequest req, HttpServletResponse res){
        String username = req.getParameter("username");
        System.out.println("注册成功，欢迎您：" + username);
    }
}
