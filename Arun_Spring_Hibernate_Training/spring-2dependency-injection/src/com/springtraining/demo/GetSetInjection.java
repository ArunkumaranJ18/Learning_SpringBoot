package com.springtraining.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetSetInjection {
	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("crickCoach",CricketCoach.class);
		                                 //Beanid , interface class for implementation
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		
		//printing the name and age injected by xml
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getAge());

		
		context.close();
	}

}

