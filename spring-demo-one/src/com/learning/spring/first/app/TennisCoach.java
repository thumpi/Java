package com.learning.spring.first.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	//
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier ("randomFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return("Practice for two hours " + this.fortuneService.getFortune());
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
