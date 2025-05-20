package com.tns.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tns.products.Product;
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
