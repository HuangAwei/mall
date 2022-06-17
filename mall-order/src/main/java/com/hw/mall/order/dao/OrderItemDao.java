package com.hw.mall.order.dao;

import com.hw.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 16:20:46
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
