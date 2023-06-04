package net.zjitc.service.Impl;

import net.zjitc.Dao.GoodsDao;
import net.zjitc.Dao.Impl.GoodsDaoImpl;
import net.zjitc.domain.Goods;
import net.zjitc.service.GoodsService;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/5/30 9:27
 */
public class GoodsServiceImpl implements GoodsService {
    GoodsDao goodsDao = new GoodsDaoImpl();
    @Override
    public List<Goods> FindAll() {
        return goodsDao.FindAll();
    }

    @Override
    public Goods FindById(int id) {
        return goodsDao.FindById(id);
    }

    @Override
    public int add(Goods goods) {
        return goodsDao.add(goods);
    }

    @Override
    public int delete(int id) {
        return goodsDao.delete(id);
    }

    @Override
    public int update(int id) {
        return goodsDao.update(id);
    }
}
