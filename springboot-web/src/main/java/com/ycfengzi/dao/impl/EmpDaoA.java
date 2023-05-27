package com.ycfengzi.dao.impl;

import com.ycfengzi.dao.EmpDao;
import com.ycfengzi.pojo.Emp;
import com.ycfengzi.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * @Author：YCFengZi
 * @Date：2023/5/27 11:07
 */
@Component
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        // 加载并解析emp.xml文件
        String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource("emp.xml")).getFile();
        System.out.println(file);
        return XmlParserUtils.parse(file, Emp.class);
    }
}
