package com.ovo.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ovo.exam.entity.Department;
import com.ovo.exam.repository.IDepartmentRepository;
import com.ovo.exam.service.IServiceOfDepartment;

@Service
public class ImplementSOD implements IServiceOfDepartment {

    @Autowired
    private IDepartmentRepository dr;

    @Override
    public List<Department> searchAllDepartment() {
        return dr.searchAllDepartment();
    }

    @Override
    public Department searchDepartmentById(int deptId) {
        return dr.searchDepartmentById(deptId);
    }

}
