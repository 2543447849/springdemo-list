package com.gaussic.dao;

import com.gaussic.model.AdminGoods;
import com.gaussic.example.AdminGoodsExample;
import java.util.List;

import com.gaussic.vo.AdminGoodsResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AdminGoodsMapper {
    int countByExample(AdminGoodsExample example);

    int deleteByExample(AdminGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminGoods record);

    int insertSelective(AdminGoods record);

    List<AdminGoods> selectByExample(AdminGoodsExample example);

    AdminGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminGoods record, @Param("example") AdminGoodsExample example);

    int updateByExample(@Param("record") AdminGoods record, @Param("example") AdminGoodsExample example);

    int updateByPrimaryKeySelective(AdminGoods record);

    int updateByPrimaryKey(AdminGoods record);

    List<AdminGoodsResult> selectAllResult();
}