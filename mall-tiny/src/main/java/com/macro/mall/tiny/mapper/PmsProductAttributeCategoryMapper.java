package com.macro.mall.tiny.mapper;

import com.macro.mall.tiny.model.PmsProductAttributeCategory;
import com.macro.mall.tiny.model.PmsProductAttributeCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsProductAttributeCategoryMapper {

    long countByExample(PmsProductAttributeCategoryExample example);

    int deleteByExample(PmsProductAttributeCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeCategory record);

    int insertSelective(PmsProductAttributeCategory record);

    List<PmsProductAttributeCategory> selectByExample(PmsProductAttributeCategoryExample example);

    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductAttributeCategory record, @Param("example") PmsProductAttributeCategoryExample example);

    int updateByExample(@Param("record") PmsProductAttributeCategory record, @Param("example") PmsProductAttributeCategoryExample example);

    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    int updateByPrimaryKey(PmsProductAttributeCategory record);
}