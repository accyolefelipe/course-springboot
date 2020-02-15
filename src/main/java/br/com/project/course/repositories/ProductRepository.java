package br.com.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
