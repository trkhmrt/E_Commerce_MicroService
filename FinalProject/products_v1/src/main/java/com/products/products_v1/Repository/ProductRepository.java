package com.products.products_v1.Repository;

import com.products.products_v1.Entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findProductByProductId(Long productId);

    @Transactional
    @Modifying
    void deleteProductByProductId(Long productId);
}
