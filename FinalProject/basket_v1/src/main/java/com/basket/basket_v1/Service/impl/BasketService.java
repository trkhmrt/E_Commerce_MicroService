package com.basket.basket_v1.Service.impl;

import com.basket.basket_v1.Entity.Basket;
import com.basket.basket_v1.Entity.BasketProductUnit;
import com.basket.basket_v1.Entity.Product;
import com.basket.basket_v1.Repository.IBasketProductUnitRepository;
import com.basket.basket_v1.Repository.IBasketRepository;
import com.basket.basket_v1.Service.IBasketService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BasketService implements IBasketService {

    private static final Logger log = LoggerFactory.getLogger(BasketService.class);
    private IBasketProductUnitRepository basketProductUnitRepository;
    private IBasketRepository basketRepository;
    private final StreamBridge streamBridge;


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
    public Long getBasket(Long customerId) {
        sendCommunication(customerId);
        return customerId;
    }

    private void sendCommunication(Long customerId) {

        log.info("Sending Communication request for the details: {}", customerId);
        var result = streamBridge.send("sendCommunication-out-0", customerId);
        log.info("Is the Communication request successfully triggered ? : {}", result);
    }

    @Override
    public List<Basket> getBaskets() {
        List<Basket> baskets = basketRepository.findAll();
        return baskets;
    }
}
