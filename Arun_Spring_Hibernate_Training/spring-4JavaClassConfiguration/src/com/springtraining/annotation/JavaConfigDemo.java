

package com.springtraining.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		//reading the xml file configuration
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//reading the bean
		Coach theCoach = context.getBean("volleyCoach",Coach.class); 
		
		//utilizing the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//closing the context
		context.close();

	}

}
