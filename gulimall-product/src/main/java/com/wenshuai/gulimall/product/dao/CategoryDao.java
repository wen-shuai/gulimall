package com.wenshuai.gulimall.product.dao;

import com.wenshuai.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 16:37:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
