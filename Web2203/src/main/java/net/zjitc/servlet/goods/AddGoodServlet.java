package net.zjitc.servlet.goods;
/**
 * @Author：YCFengZi
 * @Date：2023/6/8 15:37
 */

import net.zjitc.domain.Goods;
import net.zjitc.service.Impl.GoodsServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddGoodServlet", value = "/add")
public class AddGoodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GoodsServiceImpl goodsService = new GoodsServiceImpl();
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String information = request.getParameter("information");
        Goods goods = new Goods(name, Float.parseFloat(price), information);
        int num = goodsService.add(goods);
        if (num > 0) {
            request.getRequestDispatcher("/goods/list.jsp").forward(request,response);
        }
    }
}
