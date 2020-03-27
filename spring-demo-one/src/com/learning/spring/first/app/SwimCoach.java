package com.learning.spring.first.app;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "spend 10 minutes swimming practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ("todays fortune is  "+ this.fortuneService.getFortune());
	}

}
