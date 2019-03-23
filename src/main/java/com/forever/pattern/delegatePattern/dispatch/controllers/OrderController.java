package com.forever.pattern.delegatePattern.dispatch.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderController {

    public void findOrderById(HttpServletRequest req, HttpServletResponse res){
        String id = req.getParameter("id");
        System.out.println("找到订单！" + id);
    }
}
