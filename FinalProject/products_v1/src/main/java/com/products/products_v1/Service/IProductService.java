package com.products.products_v1.Service;

import com.products.products_v1.Dto.ProductsDto;
import com.products.products_v1.Entity.Product;

import java.util.List;

public interface IProductService {

    void addProduct(ProductsDto productDto);

    ProductsDto getProductById(Long id);

    List<Product> getAllProducts();


}
