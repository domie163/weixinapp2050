package com.project.demo.controller;

import com.project.demo.entity.ConsultationResponse;
import com.project.demo.service.ConsultationResponseService;
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
 * 咨询回复：(ConsultationResponse)表控制层
 *
 */
@RestController
@RequestMapping("/consultation_response")
public class ConsultationResponseController extends BaseController<ConsultationResponse, ConsultationResponseService> {

    /**
     * 咨询回复对象
     */
    @Autowired
    public ConsultationResponseController(ConsultationResponseService service) {
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
