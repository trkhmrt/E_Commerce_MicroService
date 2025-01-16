package com.products.products_v1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Column(name = "products_id")
    @Id
    private Long productId;
    @Column(name = "product_name")
    private String productName;

}


