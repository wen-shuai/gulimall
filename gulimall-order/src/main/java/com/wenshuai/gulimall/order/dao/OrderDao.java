package com.wenshuai.gulimall.order.dao;

import com.wenshuai.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 17:28:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
