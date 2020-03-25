package com.learning.spring.first.app;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	private String team;
	
//	public FortuneService getFortuneService() {
//		return fortuneService;
//	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 15 minutes on batting practice. \n"+this.email + "\n" + this.team; 
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return  fortuneService.getFortune();
	}
}
