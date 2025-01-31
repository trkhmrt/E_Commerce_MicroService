package com.basket.basket_v1;

import com.basket.basket_v1.Dto.BasketInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableConfigurationProperties(value = {BasketInfoDto.class})
public class BasketV1Application {

	public static void main(String[] args) {
		SpringApplication.run(BasketV1Application.class, args);
	}

}
