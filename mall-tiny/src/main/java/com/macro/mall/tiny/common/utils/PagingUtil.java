package com.macro.mall.tiny.common.utils;

import org.springframework.stereotype.Component;

/**
 * @author Ethan
 * @date 2020/4/26 - 18:04
 */
@Component
public class PagingUtil {
    public Integer getStartIndex(Integer page, Integer size) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return page;
    }
}
