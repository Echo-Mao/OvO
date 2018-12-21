package com.ovo.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ovo.exam.entity.AttendanceInfo;
import com.ovo.exam.entity.AttendanceStatus;
import com.ovo.exam.entity.Paging;
import com.ovo.exam.entity.Search;
import com.ovo.exam.repository.IAttendanceInfoRepository;
import com.ovo.exam.service.IServiceOfAttendanceInfo;

@Service
public class ImplementSOA implements IServiceOfAttendanceInfo {

    @Autowired
    private IAttendanceInfoRepository air;
    
    @Override
    public int addAttendanceInfo(AttendanceInfo aInfo) {
        return air.addAttendanceInfo(aInfo);
    }

    @Override
    public int deleteAttendanceInfo(String[] ids) {int flag = 1;
        for (String id : ids) {
            int num = air.deleteAttendanceInfo(new Integer(id));
            if(num == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }

    @Override
    public int updateAttendanceInfo(AttendanceInfo aInfo) {
        return air.updateAttendanceInfo(aInfo);
    }

    @Override
    public List<AttendanceStatus> searchAllAttendanceStatus() {
        return air.searchAllAttendanceStatus();
    }

    @Override
    public AttendanceInfo searchAttendanceInfoById(int aiId) {
        return air.searchAttendanceInfoById(aiId);
    }

    @Override
    public List<AttendanceInfo> searchAllAttendanceInfo() {
        return air.searchAllAttendanceInfo();
    }

    @Override
    public List<AttendanceInfo> searchAttendanceInfoByPaging(Paging paging) {
        // 处理分页对象
        if (paging.getPage() == 0) {
            paging.setPage(1);
        }
        // 设置符合搜索条件的总记录数
        paging.setRowsCount(searchRowsCount(paging.getSearch()));
        // 调用DAO
        return air.searchAttendanceInfoByPaging(paging);
    }

    @Override
    public int searchRowsCount(Search search) {
        return air.searchRowsCount(search);
    }

}
