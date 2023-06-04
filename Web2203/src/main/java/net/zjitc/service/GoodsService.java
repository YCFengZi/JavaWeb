package net.zjitc.service;

import net.zjitc.domain.Goods;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/5/30 9:27
 */
public interface GoodsService {
    // 查询所有商品
    public List<Goods> FindAll();
    // 查询指定商品
    public Goods FindById(int id);
    // 添加商品
    public int add(Goods goods);
    // 删除商品
    public int delete(int id);
    // 修改商品
    public int update(int id);
}
