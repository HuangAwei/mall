package com.hw.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hw.common.utils.PageUtils;
import com.hw.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 16:17:17
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

