package net.zjitc.servlet.region;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @Author：YCFengZi
 * @Date：2023/5/25 15:32
 */
@WebServlet(name = "AServlet", value = "/AServlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("a servlet...");
        // request域中设置值
        request.setAttribute("name","YCFengZi");
        // 请求转发需要先等到一个dispatcher对象,再由此对象调用forword()方法转发
        RequestDispatcher dispatcher = request.getRequestDispatcher("/BServlet");
        // 请求转发
        dispatcher.forward(request,response);
        // 请求包含
//        dispatcher.include(request,response);
    }
}
