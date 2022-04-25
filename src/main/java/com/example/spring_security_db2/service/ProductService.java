package com.example.spring_security_db2.service;

import com.example.spring_security_db2.entity.Product;
import com.example.spring_security_db2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getAllProduct(){
        return repository.findAll();
    }

    public void save(Product product){
        repository.save(product);
    }

    public Product getById(long id){
        return repository.findById(id).get();
    }

    public void delete(long id){
        repository.deleteById(id);
    }
}
