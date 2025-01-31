package com.order.order_v1.Controller;

import com.order.order_v1.Service.IBasketService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
public class OrderController {

    private final IBasketService basketService;

    public OrderController(IBasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping("/fetchBasketDetail")
    public ResponseEntity<String> fetchBasketDetail(){


        return ResponseEntity.ok(basketService.getBasket());
    }


}
