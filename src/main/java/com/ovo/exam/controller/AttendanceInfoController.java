package com.ovo.exam.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ovo.exam.entity.AttendanceInfo;
import com.ovo.exam.entity.AttendanceStatus;
import com.ovo.exam.entity.Department;
import com.ovo.exam.entity.Employee;
import com.ovo.exam.entity.Paging;
import com.ovo.exam.service.IServiceOfAttendanceInfo;
import com.ovo.exam.service.IServiceOfDepartment;
import com.ovo.exam.service.IServiceOfEmployee;

@Controller
public class AttendanceInfoController {

    @Autowired
    private IServiceOfAttendanceInfo soa;

    @Autowired
    private IServiceOfDepartment sod;

    @Autowired
    private IServiceOfEmployee soe;

    @RequestMapping("/toInfoList.action")
    public ModelAndView toInfoList(Paging paging, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        List<AttendanceInfo> infos = soa.searchAttendanceInfoByPaging(paging);
        List<AttendanceStatus> statuses = soa.searchAllAttendanceStatus();
        List<Department> departments = sod.searchAllDepartment();
        List<Employee> employees = soe.searchAllEmp();
        session.setAttribute("statuses", statuses);
        session.setAttribute("departments", departments);
        session.setAttribute("employees", employees);
        mv.addObject("infos", infos);
        mv.addObject("paging", paging);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/addInfo.action")
    public ModelAndView addInfo(AttendanceInfo info) {
        ModelAndView mv = new ModelAndView();
        Date now = new Date();
        info.setRecordTime(now);
        info.setUpdateTime(now);
        int flag = soa.addAttendanceInfo(info);
        if (flag > 0) {
            mv.setViewName("redirect:/toInfoList.action");
            return mv;
        }
        return null;
    }

    @RequestMapping("/deleteInfo.action")
    public ModelAndView deleteInfo(String[] ids) {
        ModelAndView mv = new ModelAndView();
        // 删除指定纪录
        int flag = soa.deleteAttendanceInfo(ids);
        if (flag > 0) {
            mv.setViewName("redirect:/toInfoList.action");
            return mv;
        }
        return null;
    }

    @RequestMapping("/updateStatus.action")
    public ModelAndView updateStatus(AttendanceInfo updateInfo) {
        ModelAndView mv = new ModelAndView();
        updateInfo.setUpdateTime(new Date());
        int flag = soa.updateAttendanceInfo(updateInfo);
        if (flag > 0) {
            mv.setViewName("redirect:/toInfoList.action");
            return mv;
        }
        return null;
    }

    @RequestMapping("/toUpdateStatus.action")
    public ModelAndView toUpdateStatus(AttendanceInfo info) {
        ModelAndView mv = new ModelAndView();
        int id = info.getAttendInfoId();
        AttendanceInfo updateInfo = soa.searchAttendanceInfoById(id);
        mv.addObject("updateInfo", updateInfo);
        mv.setViewName("update");
        return mv;
    }

}
