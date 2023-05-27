package com.ycfengzi.service;

import com.ycfengzi.pojo.Emp;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/5/27 11:09
 */
public interface EmpService {
    // 获取员工列表数据
    public List<Emp> listEmp();
}
