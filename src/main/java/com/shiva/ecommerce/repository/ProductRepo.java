package com.shiva.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiva.ecommerce.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findAllByCategory_Id(int id);
    
}
