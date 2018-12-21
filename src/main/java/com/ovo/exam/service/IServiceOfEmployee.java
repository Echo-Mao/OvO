package com.ovo.exam.service;

import java.util.List;

import com.ovo.exam.entity.Employee;

public interface IServiceOfEmployee {

    // 职员登录
    Employee login(Employee emp);

    // 查询所有员工
    List<Employee> searchAllEmp();

}
