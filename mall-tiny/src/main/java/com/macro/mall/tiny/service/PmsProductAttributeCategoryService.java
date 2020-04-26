package com.macro.mall.tiny.service;

import com.macro.mall.tiny.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/26 - 17:12
 */
public interface PmsProductAttributeCategoryService {

    List<PmsProductAttributeCategory> listAllCategory();

    int createCategory(PmsProductAttributeCategory category);

    int updateCategory(Long id, PmsProductAttributeCategory category);

    int deleteCategory(Long id);
}
