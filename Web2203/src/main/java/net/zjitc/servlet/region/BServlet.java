package net.zjitc.servlet.region;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author：YCFengZi
 * @Date：2023/5/25 15:32
 */
@WebServlet(name = "BServlet", value = "/BServlet")
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Object name = request.getAttribute("name");
        PrintWriter writer = response.getWriter();
        writer.write("这是b servlet的响应<br>");
        writer.write(name.toString());
    }
}
