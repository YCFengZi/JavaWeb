package com.ycfengzi.service.impl;

import com.ycfengzi.dao.EmpDao;
import com.ycfengzi.pojo.Emp;
import com.ycfengzi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/5/27 11:10
 */
//@Component // 将当前类交给IOC容器管理，成为IOC容器的bean
//@Service
public class EmpServiceB implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp() {
        // 1.调用dao，获取数据
        List<Emp> empList = empDao.listEmp();
        // 2.对数据进行转换处理
        empList.stream().forEach(emp -> {
            // 处理gender 1:男 2:女
            String gender = emp.getGender();
            if (gender.equals("1")) {
                emp.setGender("男人");
            } else {
                emp.setGender("女人");
            }
            // 处理job 1:讲师 2.班主任 3.就业指导
            String job = emp.getJob();
            switch (job) {
                case "1" -> emp.setJob("讲师");
                case "2" -> emp.setJob("班主任");
                case "3" -> emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
