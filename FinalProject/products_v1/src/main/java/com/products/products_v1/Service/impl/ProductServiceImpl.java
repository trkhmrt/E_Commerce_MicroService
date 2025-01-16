package com.products.products_v1.Service.impl;

import com.products.products_v1.Dto.ProductsDto;
import com.products.products_v1.Entity.Product;
import com.products.products_v1.Exception.ResourceNotFoundException;
import com.products.products_v1.Mapper.ProductMapper;
import com.products.products_v1.Repository.ProductRepository;

import com.products.products_v1.Service.IProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService {


    private ProductRepository productRepository;


    @Override
    public void addProduct(ProductsDto productDto) {

        Product newProduct = ProductMapper.toProducts(productDto, new Product());
        productRepository.save(newProduct);

    }

    @Override
    public ProductsDto getProductById(Long id) {
        Product product = productRepository.findProductByProductId(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        ProductsDto productsDto = ProductMapper.toProductsDto(product, new ProductsDto());
        return productsDto;
    }

    @Override
    public List<Product> getAllProducts() {

        List<Product> products = productRepository.findAll();
        return products;

    }


}
