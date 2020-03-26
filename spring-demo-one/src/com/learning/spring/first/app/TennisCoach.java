package com.learning.spring.first.app;

import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return("Practice for two hours");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
