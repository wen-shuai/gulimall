package com.wenshuai.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenshuai.common.utils.PageUtils;
import com.wenshuai.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 17:28:11
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

