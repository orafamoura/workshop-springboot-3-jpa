package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;


//nao uso @repository pois ele ja herdando do JPARepository que esta registrado como componente do spring, mas e opcional
public interface UserRepository extends JpaRepository<User, Long>{
	
}
