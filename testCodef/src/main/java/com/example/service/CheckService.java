package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.db.entity.Supplement;
import com.example.repository.CheckRepo;

@Service
public class CheckService {
	@Autowired
	CheckRepo checkRepo;

	public CheckService(CheckRepo checkRepo) {
		super();
		this.checkRepo = checkRepo;
	}
	
	@Transactional
	public void insertSupplement() throws Exception {
			Supplement supplement = Supplement.builder().supplementName(null).price(null)
					.brand(null).image(null).ingredients(null).bioavailability(null).laxative(null).kidneyDisease(null).
					consumerLabScore(null).additionalEfficacy(null).note(null).amount(null).
					requiredCount(null).formula(null).views(null).sustainedRelease(null).build();
			checkRepo.save(supplement);
		}
	}

