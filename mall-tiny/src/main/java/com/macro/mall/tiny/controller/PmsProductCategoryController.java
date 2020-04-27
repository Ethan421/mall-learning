package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.model.PmsProductCategory;
import com.macro.mall.tiny.service.PmsProductCategoryService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/24 - 20:35
 */
@RestController
@RequestMapping("/product-category")
public class PmsProductCategoryController {

    private PmsProductCategoryService categoryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @Autowired
    public void setCategoryService(PmsProductCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ApiOperation("获取所有商品分类列表")
    @GetMapping("/")
    @PreAuthorize("hasAuthority('pms:productCategory:read')")
    public CommonResult<List<PmsProductCategory>> getBrandList() {
        return CommonResult.success(categoryService.listAllCategory());
    }

    @ApiOperation("添加商品分类")
    @PostMapping(value = "/")
    @PreAuthorize("hasAuthority('pms:productCategory:create')")
    public CommonResult createCategory(@RequestBody PmsProductCategory category) {
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

    @ApiOperation("更新指定id商品分类信息")
    @PostMapping("/{id}")
    @PreAuthorize("hasAuthority('pms:productCategory:update')")
    public CommonResult updateCategory(@PathVariable("id") Long id, @RequestBody PmsProductCategory category) {
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

    @ApiOperation("删除指定id的商品分类")
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('pms:productCategory:delete')")
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
