package com.learning.spring.first.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
//@Scope("singleton")
@Component
public class TennisCoach implements Coach {
	//
	@Value("${bla.email}")
	private String email;
	
	@Value("${bla.team}")
	private String team;
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier ("randomFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return("Practice for two hours " + email + team +  this.fortuneService.getFortune());
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
