package com.learning.spring.first.app;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
		
	
//	public FortuneService getFortuneService() {
//		return fortuneService;
//	}

	public void setFortuneService(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 15 minutes on batting practice. "; 
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return  fortuneService.getFortune();
	}
}
