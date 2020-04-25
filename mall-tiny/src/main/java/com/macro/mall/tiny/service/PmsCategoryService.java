package com.macro.mall.tiny.service;

import com.macro.mall.tiny.model.PmsProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/25 - 17:36
 */
@Service
public interface PmsCategoryService {

    List<PmsProductCategory> listAllCategory();

    int createCategory(PmsProductCategory category);

    int updateCategory(Long id, PmsProductCategory category);

    int deleteCategory(Long id);

}
