package it.univr2.JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.univr2.JPA.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

}
