package com.ovo.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ovo.exam.entity.Employee;
import com.ovo.exam.repository.IEmployeeRepository;
import com.ovo.exam.service.IServiceOfEmployee;

@Service
public class ImplementSOE implements IServiceOfEmployee {

    @Autowired
    private IEmployeeRepository er;
    
    @Override
    public Employee login(Employee emp) {
        return er.login(emp);
    }

    @Override
    public List<Employee> searchAllEmp() {
        return er.searchAllEmp();
    }

}
