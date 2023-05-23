package net.zjitc.servlet.register;

import net.zjitc.domain.User;
import net.zjitc.service.Impl.UserServiceImpl;
import net.zjitc.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "registerServlet", value = "/register")
public class registerServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username,password);
        response.setHeader("Content-Type","text/html;charset=UTF-8"); //设置编码方式
        int add = userService.add(user);
        if (add > 0) {
            System.out.println("注册成功呢");
            response.getWriter().write("注册成功呢");
        } else {
            System.out.println("注册失败呢");
            response.getWriter().write("注册失败呢");
        }
    }
}
