package com.wenshuai.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenshuai.common.utils.PageUtils;
import com.wenshuai.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 17:31:07
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

