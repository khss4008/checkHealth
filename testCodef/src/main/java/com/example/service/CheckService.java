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
	//supplementName = 영양제 이름, price = 가격, brand = 브랜드, image = 경로, ingredients = 전성분
	// bioavailability = 표에서 나온 값을 평균한 점수, laxative = 이것도 마찬가지, kidneyDisease = 이것도 마찬가지
	// consumerLabscore = 컨슈머랩 점수, additionalEfficacy = 부가효과(String에 붙이는 식으로), note = 메모
	// amount = 함량, requiredCount = 하루 섭취량, formula = 제형, views -> like, sustainedRelease = 서방형
	
	
	@Transactional
	public void insertSupplement() throws Exception {
			Supplement supplement = Supplement.builder().supplementName(null).price(null)
					.brand(null).image(null).ingredients(null).bioavailability(null).laxative(null).kidneyDisease(null).
					consumerLabScore(null).additionalEfficacy(null).note(null).amount(null).
					requiredCount(null).formula(null).views(null).sustainedRelease(null).build();
			checkRepo.save(supplement);
		}
	}

