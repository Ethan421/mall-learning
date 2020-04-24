package com.macro.mall.tiny.mapper;

import com.macro.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * Created by macro on 2018/6/19.
 */
@Repository
public interface EsProductMapper {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
