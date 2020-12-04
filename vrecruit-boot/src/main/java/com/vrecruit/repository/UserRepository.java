package com.vrecruit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vrecruit.entities.Interviewer;
import com.vrecruit.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
	public  User  findById(long id);
	//public User findByUId(Long id);
}
