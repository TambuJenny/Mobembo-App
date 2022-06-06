package com.mobembo.mobembo.Interfaces;

import com.mobembo.mobembo.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>  {
    Product findByName(String name);
}
