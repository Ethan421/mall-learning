package com.macro.mall.tiny.service;

import com.macro.mall.tiny.model.PmsProduct;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/27 - 17:39
 */
public interface PmsProductService {

    List<PmsProduct> getByProduct(PmsProduct pmsProduct, Integer page, Integer size);

    int updateById(Long id, PmsProduct pmsProduct);

    int deleteById(Long id);

    int createProduct(PmsProduct pmsProduct);
}
