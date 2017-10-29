package com.gaussic.dao;

import com.gaussic.model.AdminSpeci;
import com.gaussic.example.AdminSpeciExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AdminSpeciMapper {
    int countByExample(AdminSpeciExample example);

    int deleteByExample(AdminSpeciExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminSpeci record);

    int insertSelective(AdminSpeci record);

    List<AdminSpeci> selectByExample(AdminSpeciExample example);

    AdminSpeci selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminSpeci record, @Param("example") AdminSpeciExample example);

    int updateByExample(@Param("record") AdminSpeci record, @Param("example") AdminSpeciExample example);

    int updateByPrimaryKeySelective(AdminSpeci record);

    int updateByPrimaryKey(AdminSpeci record);
}