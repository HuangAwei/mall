package com.hw.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hw.common.utils.PageUtils;
import com.hw.mall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 16:09:39
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

