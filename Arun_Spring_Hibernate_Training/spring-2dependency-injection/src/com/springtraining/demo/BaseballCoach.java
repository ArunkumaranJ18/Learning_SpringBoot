package com.springtraining.demo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public String getDailyWorkout() {
		return "Baseball coach on duty";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune 
		return fortuneService.getFortune();
	}
}