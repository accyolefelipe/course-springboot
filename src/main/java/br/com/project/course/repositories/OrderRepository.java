package br.com.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}