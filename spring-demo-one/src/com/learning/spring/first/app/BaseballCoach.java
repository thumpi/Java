package com.learning.spring.first.app;

public class BaseballCoach implements Coach {
	@Override
	public String getDailyWorkout()
	{
		return ("spend 30 minutes on batting practice");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "";
	}

}
