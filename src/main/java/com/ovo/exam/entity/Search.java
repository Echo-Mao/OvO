package com.ovo.exam.entity;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Search {

    private Integer sDeptId; // 查询时部门编号
    private Integer sStatusCode; // 查询时考勤状态代码
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sStartDate; // 查询时的开始修改日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sEndDate; // 查询时的结束修改日期

    public Integer getsDeptId() {
        return sDeptId;
    }

    public void setsDeptId(Integer sDeptId) {
        this.sDeptId = sDeptId;
    }

    public Integer getsStatusCode() {
        return sStatusCode;
    }

    public void setsStatusCode(Integer sStatusCode) {
        this.sStatusCode = sStatusCode;
    }

    public Date getsStartDate() {
        return sStartDate;
    }

    public void setsStartDate(Date sStartDate) {
        this.sStartDate = sStartDate;
    }

    public Date getsEndDate() {
        return sEndDate;
    }

    public void setsEndDate(Date sEndDate) {
        this.sEndDate = sEndDate;
    }

    @Override
    public String toString() {
        return "Search [sDeptId=" + sDeptId + ", sStatusCode=" + sStatusCode + ", sStartDate=" + sStartDate
                + ", sEndDate=" + sEndDate + "]";
    }

}
