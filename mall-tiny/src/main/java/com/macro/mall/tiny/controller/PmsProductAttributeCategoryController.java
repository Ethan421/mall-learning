package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.model.PmsProductAttributeCategory;
import com.macro.mall.tiny.service.PmsProductAttributeCategoryService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/26 - 16:26
 */
@RestController
@RequestMapping("/product-attribute-category")
public class PmsProductAttributeCategoryController {

    private PmsProductAttributeCategoryService categoryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @Autowired
    public void setCategoryService(PmsProductAttributeCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ApiOperation("获取所有商品类型分类列表")
    @GetMapping("/")
    @PreAuthorize("hasAnyAuthority('pms:productAttribute:read')")
    public CommonResult<List<PmsProductAttributeCategory>> getCategoryList(Integer page, Integer size) {
        return CommonResult.success(categoryService.listAllCategory(page, size));
    }

    @ApiOperation("/添加商品类型分类")
    @PostMapping("/")
    @PreAuthorize("hasAuthority('pms:productAttribute:create')")
    public CommonResult createCategory(@RequestBody PmsProductAttributeCategory category) {
        CommonResult commonResult;
        int count = categoryService.createCategory(category);
        if (count == 1) {
            commonResult = CommonResult.success(category);
            LOGGER.debug("createBrand success:{}", category);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", category);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id商品类型分类信息")
    @PostMapping("/{id}")
    @PreAuthorize("hasAuthority('pms:productAttribute:update')")
    public CommonResult updateCategory(@PathVariable("id") Long id, @RequestBody PmsProductAttributeCategory category) {
        CommonResult commonResult;
        int count = categoryService.updateCategory(id, category);
        if (count == 1) {
            commonResult = CommonResult.success(category);
            LOGGER.debug("updateBrand success:{}", category);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", category);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的商品类型分类")
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('pms:productAttribute:delete')")
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = categoryService.deleteCategory(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

}
