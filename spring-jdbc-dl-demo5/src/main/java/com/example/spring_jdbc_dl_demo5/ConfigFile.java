package com.example.spring_jdbc_dl_demo5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import beans.Coach;
import beans.CricketCoach;
import beans.Fortune;
import beans.RandomFortuneService;
import beans.SadFortuneService;


@Configuration
@PropertySource(value = "classpath:sport.properties")

public class ConfigFile {	
		
		
		@Bean
		public Fortune sadFortuneService() {			
			return new SadFortuneService();			
		}		
		
		@Bean
		public Fortune randomFortuneService() {		
			return new RandomFortuneService();			
		}	
		
		@Bean
		public Coach coach()
		{
			return new CricketCoach();					
		
		}
		

	
}
