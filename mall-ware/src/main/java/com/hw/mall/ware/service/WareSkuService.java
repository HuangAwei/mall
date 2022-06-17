package com.hw.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hw.common.utils.PageUtils;
import com.hw.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 16:28:50
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

