package net.zjitc.Dao.Impl;

import net.zjitc.Dao.UserDao;
import net.zjitc.Utils.JdbcUtils;
import net.zjitc.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    @Override
    public List<User> Findall() {
        String sql = "select * from `tb_user`";
        List<User> list = template.query(sql,new BeanPropertyRowMapper<User>(User.class));
        return list;
    }

    @Override
    public User FindBy(String username, String password) {
        String sql = "select * from `tb_user` where username = ? and PASSWORD = ?";
        List<User> list = template.query(sql,new BeanPropertyRowMapper<>(User.class),username,password);
        if(list.size()==0){
            return null;
        }
        if(list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public int add(User user) {
        String sql = "INSERT INTO `tb_user` (username,PASSWORD) VALUES (?,?)";
        Object[] args = {user.getUsername(),user.getPassword()};
        int result = template.update(sql,args);
        return result;
    }

    @Override
    public int update(int id, User user) {
        String sql = "UPDATE `tb_user` SET username = ?,PASSWORD = ? WHERE id = ?";
        Object[] args = {user.getUsername(),user.getPassword(),id};
        int result = template.update(sql,args);
        return result;
    }

    @Override
    public int delete(String username,String password) {
        String sql = "delete from `tb_user` where username = ? and password = ?";
        int result = template.update(sql,username,password);
        return result;
    }
}
