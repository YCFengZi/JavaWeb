package net.zjitc.Dao.Impl;

import net.zjitc.Dao.UserDao;
import net.zjitc.Utils.JdbcUtils;
import net.zjitc.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    @Override
    public List<User> FindAll() {
        String sql = "select * from `user`";
        List<User> list = template.query(sql,new BeanPropertyRowMapper<>(User.class));
        return list;
    }

    @Override
    public User FindBy(String username, String password) {
        String sql = "select * from `user` where username = ? and password = ?";
        List<User> list = template.query(sql,new BeanPropertyRowMapper<>(User.class),username,password);
        if(list.size()==0){
            return null;
        } else if(list.size()==1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int add(User user) {
        String sql = "INSERT INTO `user` (username,password) VALUES (?,?)";
        Object[] args = {user.getUsername(),user.getPassword()};
        int result = template.update(sql,args);
        return result;
    }

    @Override
    public int update(int id, User user) {
        String sql = "UPDATE `user` SET username = ?,password = ? WHERE id = ?";
        Object[] args = {user.getUsername(),user.getPassword(),id};
        int result = template.update(sql,args);
        return result;
    }

    @Override
    public int delete(String username,String password) {
        String sql = "delete from `user` where username = ? and password = ?";
        int result = template.update(sql,username,password);
        return result;
    }
}
