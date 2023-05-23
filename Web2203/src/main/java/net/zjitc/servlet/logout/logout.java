package net.zjitc.servlet.logout;

import net.zjitc.service.Impl.UserServiceImpl;
import net.zjitc.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "logout", value = "/logout")
public class logout extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.setHeader("Content-Type","text/html;charset=UTF-8"); //设置编码方式
        int delete = userService.delete(username, password);
        if (delete > 0) {
            System.out.println("注销成功");
            response.getWriter().write("注销成功");
        } else {
            System.out.println("注销失败,用户或者密码错误");
            response.getWriter().write("注销失败,用户或者密码错误");
        }
    }
}
