package com.dk.ems.Entity;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;
    @Column(name="brand")
    private String brand;
    @Column(name = "image",columnDefinition = "LONGBLOB")
    private byte[] image;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public Product() {
    }

    public Product(String name, String price, String brand, byte[] image) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Product(int id, String name, String price, String brand, byte[] image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.image = image;
    }
}
