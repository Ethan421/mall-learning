package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.common.utils.PagingUtil;
import com.macro.mall.tiny.mapper.PmsProductAttributeCategoryMapper;
import com.macro.mall.tiny.mapper.PmsProductCategoryMapper;
import com.macro.mall.tiny.model.PmsProductAttributeCategory;
import com.macro.mall.tiny.service.PmsProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/26 - 17:22
 */
@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {

    private PmsProductAttributeCategoryMapper categoryMapper;

    @Autowired
    public void setCategoryMapper(PmsProductAttributeCategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<PmsProductAttributeCategory> listAllCategory(Integer page, Integer size) {
        Integer start = PagingUtil.getStartIndex(page, size);
        return categoryMapper.selectAllByPage(start, size);
    }

    @Override
    public int createCategory(PmsProductAttributeCategory category) {
        return categoryMapper.insertSelective(category);
    }

    @Override
    public int updateCategory(Long id, PmsProductAttributeCategory category) {
        category.setId(id);
        return categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public int deleteCategory(Long id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }
}
