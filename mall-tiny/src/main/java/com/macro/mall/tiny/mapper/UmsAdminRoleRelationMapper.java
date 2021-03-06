package com.macro.mall.tiny.mapper;

import com.macro.mall.tiny.model.UmsAdminRoleRelation;
import com.macro.mall.tiny.model.UmsAdminRoleRelationExample;
import java.util.List;

import com.macro.mall.tiny.model.UmsPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsAdminRoleRelationMapper {
    long countByExample(UmsAdminRoleRelationExample example);

    int deleteByExample(UmsAdminRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRoleRelation record);

    int insertSelective(UmsAdminRoleRelation record);

    List<UmsAdminRoleRelation> selectByExample(UmsAdminRoleRelationExample example);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    int updateByExample(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    int updateByPrimaryKey(UmsAdminRoleRelation record);

    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}