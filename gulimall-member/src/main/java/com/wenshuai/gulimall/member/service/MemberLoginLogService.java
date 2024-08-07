package com.wenshuai.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenshuai.common.utils.PageUtils;
import com.wenshuai.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 17:24:01
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

