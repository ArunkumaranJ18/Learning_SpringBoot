package com.springtraining.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("VolleyCoach")

			//Default name of this bean will be volleyCoach
@Component  //Same as the class name but start with smallcase letter
//@Scope("prototype")  //scope for this bean
public class VolleyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("You're inside @PostConstruct annotation");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("You're inside @PreDestroy annotation");
	}
	
	//Constructor injection
	@Autowired
	public VolleyCoach(@Qualifier("sadFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Concentrate on the ball for 5minutes";

	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
