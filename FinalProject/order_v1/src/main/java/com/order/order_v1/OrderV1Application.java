package com.order.order_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OrderV1Application {

	public static void main(String[] args) {
		SpringApplication.run(OrderV1Application.class, args);
	}

}
