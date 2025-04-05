package com.dk.ems.Controller;

import com.dk.ems.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/auth")
public class addProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/postProduct")
    public String postProduct(@RequestParam("name") String name,
                              @RequestParam("price") String price,
                              @RequestParam("brand") String brand,
                              @RequestParam("image") MultipartFile imageFile){
        try{
            byte[] image = imageFile.getBytes();
            productService.createProduct(name,price,brand,image);
        } catch (Exception e) {
            return "Failed to add data";
        }
        return "Product add successfully";
    }

}
