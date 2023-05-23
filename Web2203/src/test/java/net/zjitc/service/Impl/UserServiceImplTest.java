package net.zjitc.service.Impl;

import net.zjitc.domain.User;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    public static UserServiceImpl userService = new UserServiceImpl();

    //查询所有用户
    @Test
    public void findall() {
        List<User> list = userService.Findall();
        for (User s : list) {
            System.out.println(s);
        }
    }

    //根据用户名和密码查询用户
    @Test
    public void findBy() {
        System.out.println(userService.FindBy("sam", "123sam321"));
    }

    //添加用户
    @Test
    public void add() {
        User user = new User("username", "password");
        System.out.println(userService.add(user));
    }

    //根据id修改用户
    @Test
    public void update() {
        int id = 8;
        User user = new User("username", "passwords");
        System.out.println(userService.update(id, user));
    }

    //输入姓名删除用户
    @Test
    public void delete() {
        System.out.println(userService.delete("username","password"));
    }
}