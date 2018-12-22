package com.ovo.exam.entity;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AttendanceStatus implements Serializable {

    private static final long serialVersionUID = -544192273855662390L;

    private Integer attendStatusId; // 考勤状态编号
    private String status; // 状态名称
    private Integer statusCode; // 状态代码

    public Integer getAttendStatusId() {
        return attendStatusId;
    }

    public void setAttendStatusId(Integer attendStatusId) {
        this.attendStatusId = attendStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "AttendanceStatus [attendStatusId=" + attendStatusId + ", status=" + status + ", statusCode="
                + statusCode + "]";
    }

}
