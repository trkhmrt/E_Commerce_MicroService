package com.basket.basket_v1.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="basket_Product_Units")
public class BasketProductUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long basketProductUnitID;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private Long productPrice;
    @Column(name = "product_quantity")
    private Integer productQuantity;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "basket_id")
    private Long basketId;

}

