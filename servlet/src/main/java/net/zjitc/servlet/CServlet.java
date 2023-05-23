package net.zjitc.servlet;

import javax.servlet.*;
import java.io.IOException;

public class CServlet implements Servlet {
    private ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // CServlet在ServletContext里面设置了character的值
        ServletContext context = servletConfig.getServletContext();
        context.setAttribute("character","utf-8");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
