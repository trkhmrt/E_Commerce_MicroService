package com.products.products_v1.Mapper;

import com.products.products_v1.Dto.ProductsDto;
import com.products.products_v1.Entity.Product;

import lombok.Data;


public class ProductMapper {

    // Product -> ProductDto dönüşümü
    public static ProductsDto toProductsDto(Product products, ProductsDto productsDto) {

        productsDto.setProductId(products.getProductId());
        productsDto.setProductName(products.getProductName());
        return productsDto;
    }

    public static Product toProducts(ProductsDto productsDto,Product products) {

        products.setProductId(productsDto.getProductId());
        products.setProductName(productsDto.getProductName());
        return products;
    }

}
