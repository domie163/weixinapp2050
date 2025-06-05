package com.project.demo.controller;

import com.project.demo.entity.DoctorUser;
import com.project.demo.service.DoctorUserService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

/**
 * 医生用户：(DoctorUser)表控制层
 *
 */
@RestController
@RequestMapping("/doctor_user")
public class DoctorUserController extends BaseController<DoctorUser, DoctorUserService> {

    /**
     * 医生用户对象
     */
    @Autowired
    public DoctorUserController(DoctorUserService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapdoctor_no = new HashMap<>();
        mapdoctor_no.put("doctor_no",String.valueOf(paramMap.get("doctor_no")));
        List listdoctor_no = service.selectBaseList(service.select(mapdoctor_no, new HashMap<>()));
        if (listdoctor_no.size()>0){
            return error(30000, "字段医生编号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
