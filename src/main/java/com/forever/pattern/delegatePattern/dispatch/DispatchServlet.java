package com.forever.pattern.delegatePattern.dispatch;

import com.forever.pattern.delegatePattern.dispatch.controllers.MemberController;
import com.forever.pattern.delegatePattern.dispatch.controllers.OrderController;
import com.forever.pattern.delegatePattern.dispatch.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatchServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doDispatch(req, res);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String servletPath = req.getServletPath();
        if(("/logout.do").equals(servletPath)){
            new SystemController().logout();
        }else if(("/member.do").equals(servletPath)){
            new MemberController().regist(req, res);
        }else if(("/order.do").equals(servletPath)){
            new OrderController().findOrderById(req,res);
        }else{
            res.getWriter().println("404  Page Not Found");
        }
    }
}
