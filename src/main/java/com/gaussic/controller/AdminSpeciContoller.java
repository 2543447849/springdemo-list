package com.gaussic.controller;

import com.gaussic.model.AdminSpeci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminSpeciContoller extends BaseController{

    @RequestMapping(value = "/speci/list", method = RequestMethod.GET)
    public String getSpecis(ModelMap modelMap) {
        // 查询user表中所有记录
        List<AdminSpeci> speciList = adminSpeciService.getList();


        // 将所有记录传递给要返回的jsp页面，放在userList当中
        modelMap.addAttribute("speciList", speciList);

        // 返回pages目录下的admin/users.jsp页面
        return "speci/index";
    }
}
