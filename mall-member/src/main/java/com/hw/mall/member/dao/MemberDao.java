package com.hw.mall.member.dao;

import com.hw.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 16:17:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
