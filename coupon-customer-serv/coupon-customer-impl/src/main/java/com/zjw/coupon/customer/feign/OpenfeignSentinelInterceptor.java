package com.zjw.coupon.customer.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class OpenfeignSentinelInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        template.header("SentinelSource", "coupon-customer-serv");
    }
}
