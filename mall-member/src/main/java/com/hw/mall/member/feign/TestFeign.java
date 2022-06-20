package com.hw.mall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("mall-coupon")
public interface TestFeign {
    @GetMapping("/coupon/coupon/test")
    public String test();
}
