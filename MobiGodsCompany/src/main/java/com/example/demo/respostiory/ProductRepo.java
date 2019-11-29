package com.example.demo.respostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Product;

@Repository

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
