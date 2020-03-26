package com.learning.spring.first.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	
	public static void main(String[] args) {
			
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);		
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
				//close the context
		context.close();
		
		
	}
	

}
