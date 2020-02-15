package br.com.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
