package com.qinshi.gmall.gateway.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

public class AuthGateWayFilterFactory extends AbstractGatewayFilterFactory<Object> {

    @Autowired
    private AuthGatewayFilter authGatewayFilter;

    @Override
    public GatewayFilter apply(Object config) {
        return authGatewayFilter;
    }
}
