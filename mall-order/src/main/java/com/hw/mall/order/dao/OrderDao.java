package com.hw.mall.order.dao;

import com.hw.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 16:20:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
