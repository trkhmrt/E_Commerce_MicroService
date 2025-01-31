package com.basket.basket_v1.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BasketDto {

    private Long userId;

    private Long productId;

    private String productName;

    private String Color;

    private double price;

    private int quantity;




}
