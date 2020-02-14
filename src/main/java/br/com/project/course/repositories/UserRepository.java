package br.com.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
