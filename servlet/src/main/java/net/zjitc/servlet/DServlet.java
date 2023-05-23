package net.zjitc.servlet;

import javax.servlet.*;
import java.io.IOException;

public class DServlet implements Servlet {
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
        // DServlet取出此值，并输出到页面
        ServletContext context = servletConfig.getServletContext();
        Object character = context.getAttribute("character");
        servletResponse.getWriter().write(character.toString());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
