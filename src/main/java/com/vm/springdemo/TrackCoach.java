package com.vm.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}
	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMystartupStuff");
	}
	
	// add destroy method
	public void doMyDestroystuff() {
		System.out.println("TrackCoach: inside method doMyDestroystuff");
	}
	
}
