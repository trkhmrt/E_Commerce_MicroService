package com.products.products_v1.Controller;



import com.products.products_v1.Dto.ProductsDto;
import com.products.products_v1.Entity.Product;
import com.products.products_v1.Service.IProductService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductsController {


    private  IProductService iProductService;

    @Autowired
    public ProductsController(IProductService iProductService) {
        this.iProductService = iProductService;
    }




    @PostMapping("/addproduct")
    public ResponseEntity<ProductsDto> addProduct(@RequestBody ProductsDto productsDto) {
        iProductService.addProduct(productsDto);
        return ResponseEntity.ok().body(productsDto);
    }


    @GetMapping("/getproducts")
    public ResponseEntity<List<Product>> getProducts() {
        ProductsDto productsDto = new ProductsDto();
        productsDto.setProductId(12L);

        return ResponseEntity.ok(iProductService.getAllProducts());
    }

    @GetMapping("/getproduct/{productId}")
    public ResponseEntity<ProductsDto> getProducts(@PathVariable Long productId) {
        ProductsDto product= iProductService.getProductById(productId);

        return ResponseEntity.ok(product);
    }





}
