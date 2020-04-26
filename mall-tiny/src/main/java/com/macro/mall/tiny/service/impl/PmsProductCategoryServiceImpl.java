package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mapper.PmsProductCategoryMapper;
import com.macro.mall.tiny.model.PmsProductCategory;
import com.macro.mall.tiny.service.PmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/25 - 18:05
 */
@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {

    private PmsProductCategoryMapper categoryMapper;

    @Autowired
    public void setCategoryMapper(PmsProductCategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<PmsProductCategory> listAllCategory() {
        return categoryMapper.selectAll();
    }

    @Override
    public int createCategory(PmsProductCategory category) {
        return categoryMapper.insertSelective(category);
    }

    @Override
    public int updateCategory(Long id, PmsProductCategory category) {
        category.setId(id);
        return categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public int deleteCategory(Long id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }
}
