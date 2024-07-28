package com.wenshuai.gulimall.order.dao;

import com.wenshuai.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 17:28:11
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
