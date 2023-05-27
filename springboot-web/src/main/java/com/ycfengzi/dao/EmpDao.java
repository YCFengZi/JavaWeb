package com.ycfengzi.dao;

import com.ycfengzi.pojo.Emp;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/5/27 11:00
 */
public interface EmpDao {
    // 获取员工列表数据
    public List<Emp> listEmp();
}
