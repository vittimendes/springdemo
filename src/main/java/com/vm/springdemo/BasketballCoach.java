package com.vm.springdemo;

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Shoot 40 free throws!";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
