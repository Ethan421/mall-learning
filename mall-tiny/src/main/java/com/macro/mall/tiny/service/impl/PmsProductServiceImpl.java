package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mapper.PmsProductMapper;
import com.macro.mall.tiny.model.PmsProduct;
import com.macro.mall.tiny.model.PmsProductExample;
import com.macro.mall.tiny.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ethan
 * @date 2020/4/27 - 17:45
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {

    private PmsProductMapper pmsProductMapper;

    @Autowired
    public void setPmsProductMapper(PmsProductMapper pmsProductMapper) {
        this.pmsProductMapper = pmsProductMapper;
    }

    @Override
    public List<PmsProduct> getByProduct(PmsProduct pmsProduct, Integer page, Integer size) {
        return null;
    }

    @Override
    public int updateById(Long id, PmsProduct pmsProduct) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int createProduct(PmsProduct pmsProduct) {
        return 0;
    }
}
