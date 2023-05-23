package net.zjitc.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class BServlet implements Servlet {
    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("init...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String servlentName = servletConfig.getServletName();
        System.out.println("servlentname: " + servlentName);
        String contextPath = servletConfig.getServletContext().getContextPath();
        System.out.println(contextPath);

        //获取请求的相关信息     Request英文名:请求
        //RemoteHost:本机的地址
        String remoteHost = servletRequest.getRemoteHost();
        String username = servletRequest.getParameter("username");
        System.out.println(remoteHost + username);

        //字节流方式输出byte()
        //servletResponse:响应出来的对象      Response中文名:响应
//        ServletOutputStream outputStream = servletResponse.getOutputStream();
//        outputStream.write(servlentName.getBytes());

        //上下输出的俩种方法只能用一种

        //字符流方式输出
        PrintWriter writer = servletResponse.getWriter();
        writer.write(contextPath);
        writer.write(username + "_" + remoteHost);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
