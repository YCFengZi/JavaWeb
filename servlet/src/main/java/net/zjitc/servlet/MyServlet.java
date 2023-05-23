package net.zjitc.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("youName","吴凡小小儿");
        Object youName = servletContext.getAttribute("youName");
        PrintWriter writer = servletResponse.getWriter();
        writer.write((String) youName);
        // 检测youName是否被设置成功
        String youNameValue = (String) servletContext.getAttribute("youName");
        if (youNameValue != null) {
            System.out.println("youName 属性值为：" + youNameValue);
        } else {
            System.out.println("youName 属性未设置");
        }
    }
}
