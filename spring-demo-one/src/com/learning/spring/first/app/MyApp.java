package com.learning.spring.first.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
			
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach footCoach = context.getBean("fCoach",Coach.class);
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(footCoach.getDailyFortune());
		//close the context
		context.close();
		
		
	}
	

}
