package com.basket.basket_v1.Controller;


import com.basket.basket_v1.Dto.BasketDto;
import com.basket.basket_v1.Dto.BasketInfoDto;
import com.basket.basket_v1.Entity.Basket;

import com.basket.basket_v1.Service.impl.BasketService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class BasketController {

    private static final Logger logger = LoggerFactory.getLogger(BasketController.class);

    private BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;

    }
    @Autowired
    BasketInfoDto basketInfoDto;

    @PostMapping("/addbasket/{customerId}")
    public void addBasket(@RequestBody List<BasketDto> basketDto,@PathVariable String customerId) {

        List<BasketDto> basketDtos = basketDto;

    }


    @GetMapping("/getbaskets")
    public List<Basket> getBaskets() {
        return basketService.getBaskets();
    }


    @RateLimiter(name="getBasketDetail",fallbackMethod = "getBasketFallBack")
    @GetMapping("/getbasket")
    public String getBasket(){
        logger.debug("Invoked getbasket info");
        //throw new RuntimeException();
        return "my basket";
    }

    public String getBasketFallBack(Throwable throwable){
        logger.debug("Invoked getbasket info");
        //throw new RuntimeException();
        return "Basket için Fallback hatası";
    }

    //@Retry(name="getbasketDetailInfo",fallbackMethod = "getbasketDetailInfoFallBack")
    @GetMapping("/getbasketdetail")
    public String getBasketDetail(){
        logger.debug("getBasketDetailInfoFallBack() getbasket info");
        //throw new RuntimeException();
        return "my basket";
    }

    public String getBasketDetailInfoFallBack(Throwable throwable){

    return "Tekrar deneme retry uyarısı";
    }

    @GetMapping("/getinfo")
    public ResponseEntity<BasketInfoDto> getInfo(){
        return ResponseEntity.status(HttpStatus.OK).body(basketInfoDto);
    }



}
