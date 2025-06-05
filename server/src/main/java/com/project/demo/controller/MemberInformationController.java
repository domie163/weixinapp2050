package com.project.demo.controller;

import com.project.demo.entity.MemberInformation;
import com.project.demo.service.MemberInformationService;
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
 * 会员信息：(MemberInformation)表控制层
 *
 */
@RestController
@RequestMapping("/member_information")
public class MemberInformationController extends BaseController<MemberInformation, MemberInformationService> {

    /**
     * 会员信息对象
     */
    @Autowired
    public MemberInformationController(MemberInformationService service) {
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
