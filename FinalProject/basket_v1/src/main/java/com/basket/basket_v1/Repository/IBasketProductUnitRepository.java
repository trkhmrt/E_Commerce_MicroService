package com.basket.basket_v1.Repository;

import com.basket.basket_v1.Entity.BasketProductUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBasketProductUnitRepository extends JpaRepository<BasketProductUnit, Long> {



}
