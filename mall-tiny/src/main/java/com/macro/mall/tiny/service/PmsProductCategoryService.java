package com.macro.mall.tiny.service;

import com.macro.mall.tiny.model.PmsProductCategory;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/25 - 17:36
 */
public interface PmsProductCategoryService {

    List<PmsProductCategory> listAllCategory();

    int createCategory(PmsProductCategory category);

    int updateCategory(Long id, PmsProductCategory category);

    int deleteCategory(Long id);

}
