package com.order.order_v1.Client;


import com.order.order_v1.Service.IBasketService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "basket" ,fallback = BasketFallback.class)
public interface BasketFeignClient {



    @GetMapping(value = "/getbasket",consumes = "application/json")
    public String getBasket();
}
