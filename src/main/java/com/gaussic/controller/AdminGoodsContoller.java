package com.gaussic.controller;

import com.gaussic.model.AdminGoods;
import com.gaussic.model.AdminSpeci;
import com.gaussic.vo.AdminGoodsResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminGoodsContoller extends BaseController{

    @RequestMapping(value = "/goods/list", method = RequestMethod.GET)
    public String getGoods(ModelMap modelMap) {
        // 查询user表中所有记录
        List<AdminGoodsResult> GoodsList = adminGoodsService.getList();


        // 将所有记录传递给要返回的jsp页面，放在userLisspeciListt当中
        modelMap.addAttribute("goodsList", GoodsList);

        // 返回pages目录下的admin/users.jsp页面
        return "goods/index";
    }
}
