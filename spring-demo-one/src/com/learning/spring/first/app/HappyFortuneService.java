package com.learning.spring.first.app;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
	
		return"Happy fortune service: This is your best day.";
	}

}
