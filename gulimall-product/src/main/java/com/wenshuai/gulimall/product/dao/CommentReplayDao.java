package com.wenshuai.gulimall.product.dao;

import com.wenshuai.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 16:37:16
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
