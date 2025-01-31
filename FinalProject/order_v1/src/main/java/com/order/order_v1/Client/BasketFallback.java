package com.order.order_v1.Client;


import org.springframework.stereotype.Component;

@Component
public class BasketFallback implements BasketFeignClient {

    @Override
    public String getBasket() {
        return "";
    }
}
