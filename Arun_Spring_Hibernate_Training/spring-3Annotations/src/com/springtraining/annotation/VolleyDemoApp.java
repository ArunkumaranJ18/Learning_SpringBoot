package com.springtraining.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VolleyDemoApp {

	public static void main(String[] args) {
		//reading the xml file configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//reading the bean
		Coach theCoach = context.getBean("volleyCoach",Coach.class); 
		
		//utilizing the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//closing the context
		context.close();

	}

}
