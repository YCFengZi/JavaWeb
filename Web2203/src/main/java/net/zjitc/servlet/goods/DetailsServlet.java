package net.zjitc.servlet.goods;

import net.zjitc.domain.Goods;
import net.zjitc.service.GoodsService;
import net.zjitc.service.Impl.GoodsServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @Author：YCFengZi
 * @Date：2023/6/3 10:59
 */
@WebServlet(name = "DetailsServlet", value = "/DetailsServlet")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        GoodsService goodsService = new GoodsServiceImpl();
        Goods goods = goodsService.FindById(Integer.parseInt(id));
        request.setAttribute("good",goods);
//        response.sendRedirect("/web2203/goods/test.jsp");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/goods/detail.jsp");
        dispatcher.forward(request,response);
    }
}
