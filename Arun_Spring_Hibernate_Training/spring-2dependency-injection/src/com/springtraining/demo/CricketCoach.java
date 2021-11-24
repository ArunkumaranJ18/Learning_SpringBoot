package com.springtraining.demo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String name;
	private int age;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("no-arg Constructor");
	}
	
	//our setter method
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside setter method.");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
