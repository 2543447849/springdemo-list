package com.gaussic.service.impl;

import com.gaussic.dao.AdminSpeciMapper;
import com.gaussic.model.AdminSpeci;
import com.gaussic.service.AdminSpeciService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("adminSpeciService")
public class AdminSpeciServiceImpl implements AdminSpeciService{
    @Resource
    private AdminSpeciMapper adminSpeciMapper;


    public AdminSpeciMapper getAdminSpeciMapper() {
        return adminSpeciMapper;
    }

    public void setAdminSpeciMapper(AdminSpeciMapper adminSpeciMapper) {
        this.adminSpeciMapper = adminSpeciMapper;
    }

    @Override
    public List<AdminSpeci> getList() {

        return adminSpeciMapper.selectByExample(null);
    }
}
