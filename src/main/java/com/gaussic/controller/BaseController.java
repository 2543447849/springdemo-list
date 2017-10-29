package com.gaussic.controller;

import com.gaussic.service.AdminGoodsService;
import com.gaussic.service.AdminSpeciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {

    @Autowired
    public AdminSpeciService adminSpeciService;

    @Autowired
    public AdminGoodsService adminGoodsService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
