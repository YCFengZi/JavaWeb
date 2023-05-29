package net.zjitc.servlet.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author：YCFengZi
 * @Date：2023/5/29 15:36
 */
@WebServlet(name = "LastAccessServlet", value = "/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        boolean flag = false;
        if (cookies.length > 0 && cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if (name.equals("lastTime")) {
                    flag = true;
                    String value = cookie.getValue();
                    System.out.println("解码前：" + value);
                    value = URLDecoder.decode(value,"utf-8");
                    System.out.println("解码后：" + value);
                    response.getWriter().write("您上次访问的时间是"+value);
                    Date date = new Date();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String time = format.format(date);
                    System.out.println("编码后：" + time);
                    time = URLEncoder.encode(time,"UTF-8");
                    System.out.println("编码后：" + time);
                    cookie.setValue(time);
                    cookie.setMaxAge(60*60*24*30);
                    response.addCookie(cookie);
                    break;
                } else if(cookies == null || cookies.length == 0 || false == false) {
                    Date date = new Date();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String time = format.format(date);
                    System.out.println("编码前：" + time);
                    time= URLEncoder.encode(time,"utf-8");
                    System.out.println("编码后：" + time);
                    Cookie cookie1 = new Cookie("lastTime",time);
                    cookie.setMaxAge(60*60*24*30);
                    response.addCookie(cookie1);
                    response.getWriter().write("首次访问");
                }
            }
        }
    }
}
