package com.ricchh.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ricchh.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface IProductRepository extends JpaRepository<Product, Long> {

}
