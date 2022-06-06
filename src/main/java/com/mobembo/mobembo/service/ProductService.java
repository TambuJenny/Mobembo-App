package com.mobembo.mobembo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.mobembo.mobembo.Interfaces.ProductRepository;
import com.mobembo.mobembo.Model.Product;

@Service
public class ProductService {

    @Autowired
    private ProductRepository _repository;

    private ProductService (ProductRepository repository )
    {
        _repository = repository;
    }

    public Product saveProduct(Product product) {
        return _repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return _repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return _repository.findAll();
    }

    public Product getProductById(int id) {
        return _repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return _repository.findByName(name);
    }

    public String deleteProduct(int id) {
        _repository.deleteById(id);
        return "product removed !! " + id;
    }

   public Product updateProduct(Product product) {
        Product existingProduct = _repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return _repository.save(existingProduct);
    }
}
