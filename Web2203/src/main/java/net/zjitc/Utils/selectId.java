package net.zjitc.Utils;

import net.zjitc.domain.Goods;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/6/1 15:44
 */
public class selectId {
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
    public int FindById(String username) {
        String sql = "select id from user where username = ?";
        List<Goods> list = template.query(sql, new BeanPropertyRowMapper<>(Goods.class), username);
        return list.get(0).getId();
    }
}
