package com.gaussic.service.impl;

import com.gaussic.dao.AdminGoodsMapper;
import com.gaussic.model.AdminGoods;
import com.gaussic.model.AdminSpeci;
import com.gaussic.service.AdminGoodsService;
import com.gaussic.vo.AdminGoodsResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("adminGoodsService")
public class AdminGoodsServiceImpl implements AdminGoodsService{

    @Resource
    private AdminGoodsMapper adminGoodsMapper;

    public AdminGoodsMapper getAdminGoodsMapper() {
        return adminGoodsMapper;
    }

    public void setAdminGoodsMapper(AdminGoodsMapper adminGoodsMapper) {
        this.adminGoodsMapper = adminGoodsMapper;
    }

    @Override
    public List<AdminGoodsResult> getList() {
        return adminGoodsMapper.selectAllResult();
    }
}
