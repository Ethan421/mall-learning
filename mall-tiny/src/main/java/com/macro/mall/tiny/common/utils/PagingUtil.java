package com.macro.mall.tiny.common.utils;

/**
 * @author Ethan
 * @date 2020/4/26 - 17:34
 */
public class PagingUtil {
    public static Integer getStartIndex(Integer page, Integer size) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return page;
    }
}
