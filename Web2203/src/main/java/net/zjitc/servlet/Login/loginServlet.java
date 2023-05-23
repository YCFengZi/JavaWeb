package net.zjitc.servlet.Login;

import net.zjitc.domain.User;
import net.zjitc.service.Impl.UserServiceImpl;
import net.zjitc.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class loginServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.FindBy(username,password);
        response.setHeader("Content-Type","text/html;charset=UTF-8"); //设置编码方式
        if (user != null) {
            System.out.println("登陆成功");
            response.getWriter().write("登陆成功");
        } else {
            System.out.println("登陆失败");
            response.getWriter().write("登陆失败");
        }
    }
}
