package com.vrecruit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vrecruit.entities.JobApplication;
import com.vrecruit.entities.User;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication,Long>{
	public Optional<JobApplication> findByJid(Long jid);

}
