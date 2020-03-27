package com.learning.spring.first.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MyApp {

	
	public static void main(String[] args) {
			
		//load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// retrieve bean from spring container
		Coach theCoach1 = context.getBean("tennisCoach",Coach.class);
		Coach theCoach2 = context.getBean("tennisCoach",Coach.class);		
		
		//call methods on bean
		System.out.println(theCoach1);
		System.out.println(theCoach2);
				//close the context
		context.close();
		
		
	}
	

}
