package com.learning.spring.first.app;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.learning.spring.first.app")
@PropertySource("classpath:sport.properties")
public class AppConfig {
	//define bean for SadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}

}
