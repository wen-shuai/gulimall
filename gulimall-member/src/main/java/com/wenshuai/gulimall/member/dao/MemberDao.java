package com.wenshuai.gulimall.member.dao;

import com.wenshuai.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wenshuai
 * @email wenshuai998@gmail.com
 * @date 2024-07-23 17:24:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
