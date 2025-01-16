package com.basket.basket_v1.Service.impl;

import com.basket.basket_v1.Entity.Basket;
import com.basket.basket_v1.Entity.BasketProductUnit;
import com.basket.basket_v1.Entity.Product;
import com.basket.basket_v1.Repository.IBasketProductUnitRepository;
import com.basket.basket_v1.Repository.IBasketRepository;
import com.basket.basket_v1.Service.IBasketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BasketService implements IBasketService {

    private IBasketProductUnitRepository basketProductUnitRepository;
    private IBasketRepository basketRepository;


    @Override
    public void addProductToBasket() {
        Product product = new Product() {{
            setProductId(2L);
            setProductName("Ayakkabı");
        }};

        Optional<Basket> basket = basketRepository.findBasketByCustomerId(101L);
        if(basket.isPresent()) {
            BasketProductUnit basketProductUnit = new BasketProductUnit();
            basketProductUnit.setBasketId(1L);
            basketProductUnit.setProductPrice(200L);
            basketProductUnit.setProductName("Ayakkabı");
            basketProductUnit.setProductQuantity(1);
            basketProductUnit.setCustomerId(101L);
            basketProductUnitRepository.save(basketProductUnit);


        }
        else{
            Basket  newBasket = new Basket();
            newBasket.setCustomerId(1L);
        }










    }

    @Override
    public Basket getBasket(Long customerId) {
        return null;
    }

    @Override
    public List<Basket> getBaskets() {
        List<Basket> baskets = basketRepository.findAll();
        return baskets;
    }
}
