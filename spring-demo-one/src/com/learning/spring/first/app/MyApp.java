package com.learning.spring.first.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
			
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach theCoach1 = context.getBean("myCoach",Coach.class);

		System.out.println(theCoach);
		System.out.println(theCoach1);

		//close the context
		context.close();
		
		
	}
	

}
