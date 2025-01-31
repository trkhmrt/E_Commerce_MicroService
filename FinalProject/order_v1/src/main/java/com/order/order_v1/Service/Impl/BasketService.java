package com.order.order_v1.Service.Impl;

import com.order.order_v1.Client.BasketFeignClient;
import com.order.order_v1.Service.IBasketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class BasketService implements IBasketService {
    private BasketFeignClient basketFeignClient;
    @Override
    public String getBasket() {
        return basketFeignClient.getBasket();
    }
}
