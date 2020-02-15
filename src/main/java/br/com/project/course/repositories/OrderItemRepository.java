package br.com.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
