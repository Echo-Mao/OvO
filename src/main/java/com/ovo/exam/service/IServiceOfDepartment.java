package com.ovo.exam.service;

import java.util.List;

import com.ovo.exam.entity.Department;

public interface IServiceOfDepartment {

    // 查询所有部门(下拉框使用
    List<Department> searchAllDepartment();

    // 通过id查询部门信息
    Department searchDepartmentById(int deptId);

}
