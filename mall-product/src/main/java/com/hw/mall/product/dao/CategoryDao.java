package com.hw.mall.product.dao;

import com.hw.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huangwei
 * @email 1074882994@qq.com
 * @date 2022-06-17 13:35:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
