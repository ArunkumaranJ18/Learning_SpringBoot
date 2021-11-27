package com.springtraining.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//reading the xml file configuration
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//reading the bean
		SwimCoach theCoach = context.getBean("swimCoachBean",SwimCoach.class); 
		
		//utilizing the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//calling our .properties variables
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		
		//closing the context
		context.close();

	}

}
