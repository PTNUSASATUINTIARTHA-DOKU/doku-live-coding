package com.doku.live.coding.dokutest.repositories;

import com.doku.live.coding.dokutest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
