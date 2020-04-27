package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.model.PmsProduct;
import com.macro.mall.tiny.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/27 - 17:36
 */
@RestController
@RequestMapping("/product")
public class PmsProductController {

    private PmsProductService pmsProductService;

    @Autowired
    public void setPmsProductService(PmsProductService pmsProductService) {
        this.pmsProductService = pmsProductService;
    }

    @GetMapping("/")
    public CommonResult<List<PmsProduct>> listByPage(@RequestBody PmsProduct pmsProduct, Integer page, Integer size) {
        return CommonResult.success(pmsProductService.getByProduct(pmsProduct, page, size));
    }

}
