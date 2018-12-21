package com.ovo.exam.entity;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AttendanceInfo {

    private Integer attendInfoId; // 考勤信息编号
    private Integer empId; // 员工编号
    private Integer asCode; // 状态代码
    private Employee employee; // 通过empid查找与该条记录挂钩的员工信息
    private AttendanceStatus attendStatus; // 通过asid查找与该条信息挂钩的状态信息
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date recordTime; // 第一次写入的时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime; // 最后一次修改的时间
    private Integer isDelete; // 是否删除? 1为否,0为是

    public Integer getAttendInfoId() {
        return attendInfoId;
    }

    public void setAttendInfoId(Integer attendInfoId) {
        this.attendInfoId = attendInfoId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getAsCode() {
        return asCode;
    }

    public void setAsCode(Integer asCode) {
        this.asCode = asCode;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public AttendanceStatus getAttendStatus() {
        return attendStatus;
    }

    public void setAttendStatus(AttendanceStatus attendStatus) {
        this.attendStatus = attendStatus;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "AttendanceInfo [attendInfoId=" + attendInfoId + ", empId=" + empId + ", asCode=" + asCode
                + ", employee=" + employee + ", attendStatus=" + attendStatus + ", recordTime=" + recordTime
                + ", updateTime=" + updateTime + ", isDelete=" + isDelete + "]";
    }

}
