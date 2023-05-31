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
    public Goods FindByName(String name) {
        return goodsDao.FindByName(name);
    }

    @Override
    public List<Goods> FindBy(String name) {
        return goodsDao.FindBy(name);
    }

    @Override
    public int add(Goods goods) {
        return goodsDao.add(goods);
    }

    @Override
    public int delete(String name) {
        return goodsDao.delete(name);
    }

    @Override
    public int update(String name) {
        return goodsDao.update(name);
    }
}
