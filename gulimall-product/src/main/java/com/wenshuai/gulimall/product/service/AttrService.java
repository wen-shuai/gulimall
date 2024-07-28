package com.wenshuai.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenshuai.common.utils.PageUtils;
import com.wenshuai.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 16:37:17
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

