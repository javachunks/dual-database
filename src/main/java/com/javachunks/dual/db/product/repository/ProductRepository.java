package com.javachunks.dual.db.product.repository;

import com.javachunks.dual.db.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(value = "productTransactionManager")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
