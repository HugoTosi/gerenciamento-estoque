package com.projeto.estoque.repositories;

import com.projeto.estoque.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByname(String name);

}
// Utilizando os metodos do JPA para que seja possivel realizar consultas no bd
// Toda entidade precisa de um repository