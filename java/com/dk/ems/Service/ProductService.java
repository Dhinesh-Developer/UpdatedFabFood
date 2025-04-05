package com.dk.ems.Service;

import com.dk.ems.Entity.Product;
import com.dk.ems.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public void createProduct(String name, String price, String brand, byte[] image) {
        Product product = new Product(name,price,brand,image);
         productRepo.save(product);
    }
}
