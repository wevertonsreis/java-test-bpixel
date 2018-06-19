package br.com.javatestbpixel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.javatestbpixel.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}