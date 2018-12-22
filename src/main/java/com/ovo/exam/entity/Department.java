package com.ovo.exam.entity;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Department implements Serializable {

    private static final long serialVersionUID = -8128434318452388103L;

    private Integer deptId; // 部门编号
    private String deptName;// 部门名称

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
    }

}
