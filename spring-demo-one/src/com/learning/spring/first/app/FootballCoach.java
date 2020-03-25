package com.learning.spring.first.app;

public class FootballCoach implements Coach {
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService thefortuneService) {
				fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
			return "spend 20 minutes on running practice.";
	}

	@Override
	public String getDailyFortune() {
		
		return "this is my own coding "+ fortuneService.getFortune();
	}

}
