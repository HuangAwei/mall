package com.hw.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hw.common.utils.PageUtils;
import com.hw.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 13:35:34
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

