package com.hw.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hw.common.utils.PageUtils;
import com.hw.mall.member.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 16:17:17
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

