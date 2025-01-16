
package com.basket.basket_v1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="baskets")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="basket_Id")
    private Long basketId;

    @Column(name = "created_at")
    private LocalDate cretedAt;

    @Column(name = "total_quantity")
    private Integer totalQuantity;

    @Column(name="customer_Id")
    private Long customerId;


}
