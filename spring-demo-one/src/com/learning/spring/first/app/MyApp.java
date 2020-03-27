package com.learning.spring.first.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MyApp {

	
	public static void main(String[] args) {
			
		//load the spring configuration file 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// retrieve bean from spring container
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
				//close the context
		context.close();
		
		
	}
	

}