package com.ovo.exam.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ovo.exam.entity.AttendanceInfo;
import com.ovo.exam.entity.AttendanceStatus;
import com.ovo.exam.entity.Paging;
import com.ovo.exam.entity.Search;

@Mapper
public interface IAttendanceInfoRepository {

    // 添加考勤信息
    int addAttendanceInfo(AttendanceInfo aInfo);

    // 删除考勤信息(伪
    int deleteAttendanceInfo(int id);

    // 修改考勤信息(只改状态
    int updateAttendanceInfo(AttendanceInfo aInfo);

    // 查询所有考勤状态(下拉框用
    List<AttendanceStatus> searchAllAttendanceStatus();

    // 通过id查询考勤信息
    AttendanceInfo searchAttendanceInfoById(int aiId);

    // 查询所有考勤信息
    List<AttendanceInfo> searchAllAttendanceInfo();

    // 分页查询考勤信息
    List<AttendanceInfo> searchAttendanceInfoByPaging(Paging paging);

    // 查询符合查询条件的总记录数
    int searchRowsCount(Search search);

}
