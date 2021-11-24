package com.springtraining.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("volleyCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("volleyCoach",Coach.class);
		
		//check if they are the same 
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\n Pointing tto the same object: " + result);
		
		System.out.println("\n Memory location for theCoach: " + theCoach);
		
		System.out.println("\n Memory location for the alphaCoach " + alphaCoach);
		
		//close the context
		context.close();
	}

}
