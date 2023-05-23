package net.zjitc.service.Impl;

import net.zjitc.Dao.Impl.UserDaoImpl;
import net.zjitc.domain.User;
import net.zjitc.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public List<User> Findall() {
        return userDao.Findall();
    }

    @Override
    public User FindBy(String username, String password) {
        return userDao.FindBy(username,password);
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int update(int id, User user) {
        return userDao.update(id,user);
    }

    @Override
    public int delete(String username,String password) {
        return userDao.delete(username,password);
    }
}
