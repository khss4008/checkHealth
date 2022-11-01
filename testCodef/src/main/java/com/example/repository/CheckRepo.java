package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.db.entity.Supplement;

@Repository
public interface CheckRepo extends JpaRepository<Supplement, Integer>{
	
}
