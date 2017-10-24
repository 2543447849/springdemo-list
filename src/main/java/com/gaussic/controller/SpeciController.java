package com.gaussic.controller;

import com.gaussic.model.SpeciEntity;
import com.gaussic.repository.SpeciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

/**
 * Created by dzkan on 2016/3/8.
 */
@Controller
public class SpeciController {

    // 自动装配数据库接口，不需要再写原始的Connection来操作数据库
    @Autowired
    SpeciRepository speciRepository;

    @RequestMapping(value = "/admin/speci", method = RequestMethod.GET)
    public String getSpecis(ModelMap modelMap) {
        // 查询admin_speci表中所有记录
       List<SpeciEntity> speciList = speciRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在userList当中
        modelMap.addAttribute("speciList", speciList);

        // 返回pages目录下的admin/speci.jsp页面
        return "admin/speci";
    }

    // get请求，访问添加用户 页面
    @RequestMapping(value = "/admin/speci/add", method = RequestMethod.GET)
    public String addSpeci() {
        // 返回 admin/addSpeci.jsp页面
        return "admin/addSpeci";
    }

    // post请求，处理添加用户请求，并重定向到用户管理页面
    @RequestMapping(value = "/admin/speci/addP", method = RequestMethod.POST)
    public String addSpeciPost(@ModelAttribute("admin_specis") SpeciEntity speciEntity) {
        // 注意此处，post请求传递过来的是一个SpeciEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);
//        System.out.println(userEntity.getFirstName());
//        System.out.println(userEntity.getLastName());
           System.out.println(speciEntity.getName());
           System.out.println(speciEntity.getNickname());

        // 数据库中添加一个用户，并立即刷新缓存
        speciEntity.setCreate_time(new Date());
        speciEntity.setModify_time(new Date());
        speciRepository.saveAndFlush(speciEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/admin/speci";
    }

    // 查看用户详情
    // @PathVariable可以收集url中的变量，需匹配的变量用{}括起来
    // 例如：访问 localhost:8080/admin/speci/show/1 ，将匹配 id = 1
    @RequestMapping(value = "/admin/speci/show/{id}", method = RequestMethod.GET)
    public String showSpeci(@PathVariable("id") Integer speciId, ModelMap modelMap) {

        // 找到userId所表示的用户
         SpeciEntity speciEntity = speciRepository.findOne(speciId);

        // 传递给请求页面
        modelMap.addAttribute("speci", speciEntity);
        return "admin/speciDetail";
    }

    // 更新用户信息 页面
    @RequestMapping(value = "/admin/speci/update/{id}", method = RequestMethod.GET)
    public String updateSpeci(@PathVariable("id") Integer speciId, ModelMap modelMap) {

        // 找到userId所表示的用户
        SpeciEntity speciEntity = speciRepository.findOne(speciId);

        // 传递给请求页面
        modelMap.addAttribute("speci", speciEntity);
        return "admin/updateSpeci";
    }

    // 更新用户信息 操作
    @RequestMapping(value = "/admin/speci/updateP", method = RequestMethod.POST)
    public String updateSpeciPost(@ModelAttribute("speciP") SpeciEntity speci) {

        // 更新用户信息
        //speci.setModify_time(new Date());
        speciRepository.updateSpeci(speci.getName(),speci.getNickname(),
                speci.getIntroduction(),speci.getPlace(),speci.getId());
        speciRepository.flush(); // 刷新缓冲区
        return "redirect:/admin/speci";
    }

    // 删除用户
    @RequestMapping(value = "/admin/speci/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Integer speciId) {

        // 删除id为userId的用户
        speciRepository.delete(speciId);
        // 立即刷新
        speciRepository.flush();
        return "redirect:/admin/speci";
    }



}
