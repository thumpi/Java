package com.learning.spring.first.app;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.learning.spring.first.app")
@PropertySource("classpath:sport.properties")
public class AppConfig {

}
