package com.ovo.exam.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ovo.exam.entity.Employee;

@Mapper
public interface IEmployeeRepository {
    
    // 职员登录
    Employee login(Employee emp);
    
    // 查询所有员工
    List<Employee> searchAllEmp();
}
