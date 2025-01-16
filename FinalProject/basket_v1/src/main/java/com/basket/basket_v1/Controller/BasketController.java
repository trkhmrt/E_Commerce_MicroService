package com.basket.basket_v1.Controller;


import com.basket.basket_v1.Dto.BasketInfoDto;
import com.basket.basket_v1.Entity.Basket;

import com.basket.basket_v1.Service.impl.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasketController {

    private BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;

    }
    @Autowired
    BasketInfoDto basketInfoDto;

    @GetMapping("/addbasket")
    public void addBasket() {
        basketService.addProductToBasket();
    }


    @GetMapping("/getbaskets")
    public List<Basket> getBaskets() {

        return basketService.getBaskets();
    }


    @GetMapping("/getinfo")
    public ResponseEntity<BasketInfoDto> getInfo(){
        return ResponseEntity.status(HttpStatus.OK).body(basketInfoDto);
    }



}
