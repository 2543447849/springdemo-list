package com.gaussic.service;

import com.gaussic.model.AdminGoods;
import com.gaussic.model.AdminSpeci;
import com.gaussic.vo.AdminGoodsResult;

import java.util.List;

public interface AdminGoodsService {

    List<AdminGoodsResult> getList();
}
