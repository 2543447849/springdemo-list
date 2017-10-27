package com.gaussic.repository;

import com.gaussic.model.SpeciEntity;
import com.gaussic.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by qianxu on 2017/10/21.
 */
@Repository
public interface SpeciRepository extends JpaRepository<SpeciEntity, Integer> {

    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update SpeciEntity ps set ps.name=:qname, ps.nickname=:qNickName, ps.introduction=:qIntroduction, ps.place=:qPlace where ps.id=:qId")
    public void updateSpeci(@Param("qname") String name, @Param("qNickName") String nickname,
                           @Param("qIntroduction") String introduction, @Param("qPlace") String place, @Param("qId") Integer id);
}
