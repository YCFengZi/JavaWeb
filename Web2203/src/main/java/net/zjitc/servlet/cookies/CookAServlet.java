package net.zjitc.servlet.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author：YCFengZi
 * @Date：2023/5/29 14:16
 */
@WebServlet(name = "CookAServlet", value = "/CookAServlet")
public class CookAServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 第一次访问时，设置name=?的cookie
        // 第二次访问时，获取并输出此cookies信息
        // 首先获取cookie，在判断有没有cookie，有则获取，没有则添加
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        Cookie[] cookies = request.getCookies();
        boolean flag = true;
        if (cookies.length == 0 || cookies == null) {
            Cookie cookie = new Cookie("name", "YCFengZi");
            response.addCookie(cookie);
            writer.write("请求结束");
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("name")) {
                    flag = false;
                    writer.write("已存在Cookie,不是第一次访问");
                }
            }
        }
        if (flag) {
            Cookie cookie = new Cookie("name","YCFengZi");
            cookie.setMaxAge(60*60);
            response.addCookie(cookie);
            writer.write("第一次访问");
        }
    }
}
