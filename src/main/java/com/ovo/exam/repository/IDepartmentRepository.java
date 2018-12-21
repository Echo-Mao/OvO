package com.ovo.exam.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ovo.exam.entity.Department;

@Mapper
public interface IDepartmentRepository {

    // 查询所有部门(下拉框使用
    List<Department> searchAllDepartment();

    // 通过id查询部门信息
    Department searchDepartmentById(int deptId);

}
