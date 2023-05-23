package net.zjitc.service;

import net.zjitc.domain.User;

import java.util.List;

public interface UserService {
    public List<User> Findall();
    //根据用户名和密码查询用户
    public User FindBy(String username,String password);
    //添加用户
    public int add(User user);
    //修改用户
    public int update(int id,User user);
    //删除用户
    public int delete(String username);
}
