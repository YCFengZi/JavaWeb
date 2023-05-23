package net.zjitc.servlet;

import javax.servlet.*;
import java.io.IOException;


public class AServlet implements Servlet {

    private ServletConfig servletConfig;
    int count = 0;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("init...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        count++;
        String str = servletConfig.getInitParameter("name");
        System.out.println(str);
        System.out.println("Count:"+count);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
