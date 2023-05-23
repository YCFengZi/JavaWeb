package net.zjitc.service.Impl;

import net.zjitc.Dao.Impl.UserDaoImpl;
import net.zjitc.domain.User;
import net.zjitc.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoImpl userdao = new UserDaoImpl();

    @Override
    public List<User> Findall() {
        return userdao.Findall();
    }

    @Override
    public User FindBy(String username, String password) {
        return userdao.FindBy(username,password);
    }

    @Override
    public int add(User user) {
        return userdao.add(user);
    }

    @Override
    public int update(int id, User user) {
        return userdao.update(id,user);
    }

    @Override
    public int delete(String username) {
        return userdao.delete(username);
    }
}
