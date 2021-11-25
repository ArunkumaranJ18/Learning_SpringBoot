package com.springtraining.annotation;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim from early morning";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
