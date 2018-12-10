package com.vm.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
