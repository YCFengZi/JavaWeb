package net.zjitc.servlet.goods;

import net.zjitc.Dao.GoodsDao;
import net.zjitc.Dao.Impl.GoodsDaoImpl;
import net.zjitc.domain.Goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/5/30 9:25
 */
@WebServlet(name = "GoodsListServlet", value = "/goodsList")
public class GoodsListServlet extends HttpServlet {
    private GoodsDao goodsDao;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-Type","text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user == null) {
            writer.write("请先<a href=\"/web2203/Login/login.jsp\">登录</a>！");
        } else {
            // 查询登录用户购买商品的信息

        }
    }
}
