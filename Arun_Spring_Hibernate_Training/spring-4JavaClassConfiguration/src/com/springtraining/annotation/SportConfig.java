package com.springtraining.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springtraining.annotation")
public class SportConfig {
	//defining bean for our fortuneservice
	@Bean
	public FortuneService sadFortuneServiceBean() {
		//method name is the bean id i.e) "sadFortuneServiceBean" is the current bean id
		return new SadFortuneService();
	}
	
	//defining bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoachBean(){
		return new SwimCoach(sadFortuneServiceBean());
	}

}
