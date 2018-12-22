package com.ovo.exam.entity;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee implements Serializable {

    private static final long serialVersionUID = -7729987059715635006L;

    private Integer empId; // 职员编号
    private String empName; // 职员姓名
    private String empPwd; // 职员登录密码
    private Integer deptId; // 职员所属部门编号
    private Integer power; // 职员所有权限
    private Department department; // 查询所属部门

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empPwd=" + empPwd + ", deptId=" + deptId
                + ", power=" + power + ", department=" + department + "]";
    }

}
