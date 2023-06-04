package net.zjitc.Dao.Impl;

import net.zjitc.Dao.GoodsDao;
import net.zjitc.Utils.JdbcUtils;
import net.zjitc.domain.Goods;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/5/30 9:28
 */
public class GoodsDaoImpl implements GoodsDao {
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
    @Override
    public List<Goods> FindAll() {
        String sql = "select * from goods";
        List<Goods> list = template.query(sql,new BeanPropertyRowMapper<>(Goods.class));
        return list;
    }

    @Override
    public Goods FindById(int id) {
        String sql = "select * from goods where id = ?";
        List<Goods> list = template.query(sql, new BeanPropertyRowMapper<>(Goods.class), id);
        if (list.size() == 0) {
            return null;
        } else if(list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int add(Goods goods) {
        String sql = "INSERT INTO goods (id,name,image,price,information) VALUES (?,?,?,?,?)";
        Object[] args = {goods.getId(),goods.getName(),goods.getImage(),goods.getPrice(),goods.getInformation()};
        int result = template.update(sql, args);
        return result;
    }

    @Override
    public int delete(int id) {
        String sql = "delete from goods where id = ?";
        int result = template.update(sql, id);
        return result;
    }

    @Override
    public int update(int id) {
        String sql = "UPDATE goods SET id = ?";
        int result = template.update(sql, id);
        return result;
    }
}
