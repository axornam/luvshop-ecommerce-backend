package com.ricchh.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricchh.ecommerce.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
