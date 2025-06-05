package com.project.demo.controller;

import com.project.demo.entity.HealthRecords;
import com.project.demo.service.HealthRecordsService;
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
 * 健康档案：(HealthRecords)表控制层
 *
 */
@RestController
@RequestMapping("/health_records")
public class HealthRecordsController extends BaseController<HealthRecords, HealthRecordsService> {

    /**
     * 健康档案对象
     */
    @Autowired
    public HealthRecordsController(HealthRecordsService service) {
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
