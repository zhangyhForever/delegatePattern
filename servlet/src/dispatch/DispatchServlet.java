package dispatch;

import dispatch.controllers.MemberController;
import dispatch.controllers.OrderController;
import dispatch.controllers.SystemController;

import javax.servlet.RequestDispatcher;
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
        System.out.println(servletPath);
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
