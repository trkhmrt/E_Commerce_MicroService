package com.basket.basket_v1.Service;

import com.basket.basket_v1.Entity.Basket;

import java.util.List;

public interface IBasketService {
    void addProductToBasket();

    Long getBasket(Long customerId);

    List<Basket> getBaskets();
}
