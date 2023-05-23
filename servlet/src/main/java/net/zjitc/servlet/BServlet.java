package net.zjitc.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class BServlet implements Servlet {
    private ServletConfig servletConfig;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("init..");
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String servletName = servletConfig.getServletName();
        String contestText = String.valueOf(servletConfig.getServletContext());
        System.out.println("servletName = " + servletName + "\ncontestPath = " + contestText);
        //字节流
//        ServletOutputStream outputStream = servletResponse.getOutputStream();
//        outputStream.write(servletName.getBytes());
        // 字符流
        PrintWriter writer = servletResponse.getWriter();
        writer.write(contestText);
        // 获取相关信息
        String remoteHost = servletRequest.getRemoteHost();
        String username = servletRequest.getParameter("username");
        System.out.println(remoteHost + username);
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy..");
    }
}
