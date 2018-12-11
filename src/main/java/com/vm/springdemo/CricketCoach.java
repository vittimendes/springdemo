package com.vm.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortunesService;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}	
	
	public void setFortunesService(FortuneService fortunesService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortunesService = fortunesService;
	}


	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	public String getDailyFortune() {
		return fortunesService.getFortune();
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
	
	
	

}
