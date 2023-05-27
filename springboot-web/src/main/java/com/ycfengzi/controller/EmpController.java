package com.ycfengzi.controller;

import com.ycfengzi.pojo.Emp;
import com.ycfengzi.pojo.Result;
import com.ycfengzi.service.EmpService;
import com.ycfengzi.service.impl.EmpServiceA;
import com.ycfengzi.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * @Author：YCFengZi
 * @Date：2023/5/27 10:31
 */
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/listEmp")
    public Result list() {
        // 调用service，获取数据
        List<Emp> empList = empService.listEmp();
        // 响应数据
        return Result.success(empList);
    }

//    @RequestMapping("/listEmp")
//    public Result list() {
//        // 1.加载并解析emp.xml文件
//        String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource("emp.xml")).getFile();
//        System.out.println(file);
//        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//        // 2.对数据进行转换处理
//        empList.stream().forEach(emp -> {
//            // 处理gender 1:男 2:女
//            String gender = emp.getGender();
//            if (gender.equals("1")) {
//                emp.setGender("男");
//            } else {
//                emp.setGender("女");
//            }
//            // 处理job 1:讲师 2.班主任 3.就业指导
//            String job = emp.getJob();
//            switch (job) {
//                case "1" -> emp.setJob("讲师");
//                case "2" -> emp.setJob("班主任");
//                case "3" -> System.out.println("就业指导");
//            }
//        });
//        // 3.响应数据
//        return Result.success(empList);
//    }
}
