package com.project.demo.controller;

import com.project.demo.entity.PhysicalExaminationAppointment;
import com.project.demo.service.PhysicalExaminationAppointmentService;
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
 * 体检预约：(PhysicalExaminationAppointment)表控制层
 *
 */
@RestController
@RequestMapping("/physical_examination_appointment")
public class PhysicalExaminationAppointmentController extends BaseController<PhysicalExaminationAppointment, PhysicalExaminationAppointmentService> {

    /**
     * 体检预约对象
     */
    @Autowired
    public PhysicalExaminationAppointmentController(PhysicalExaminationAppointmentService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
