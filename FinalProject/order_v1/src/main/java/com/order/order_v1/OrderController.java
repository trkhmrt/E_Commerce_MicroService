package com.order.order_v1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Data
@RestController
public class OrderController {

    @Autowired
    HelloClient client;

    @RequestMapping("/")
    public String hello() {
        return client.hello();
    }


    @FeignClient("HelloServer")
    interface HelloClient {
        @RequestMapping(value = "/", method = GET)
        String hello();
    }

}
