package com.basket.basket_v1.Repository;

import com.basket.basket_v1.Entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBasketRepository extends JpaRepository<Basket, Long> {

        Optional<Basket> findBasketByCustomerId(Long id);
}
