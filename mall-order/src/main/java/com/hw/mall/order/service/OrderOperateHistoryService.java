package com.hw.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hw.common.utils.PageUtils;
import com.hw.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 16:20:46
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

