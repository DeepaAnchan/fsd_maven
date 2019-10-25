package com.example.spring_jdbc_dl_demo5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import beans.Coach;
import beans.CricketCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigFile.class);
		Coach theCoach=context.getBean("coach",CricketCoach.class);
		System.out.println(theCoach.getWorkout());
		System.out.println(theCoach.getDailyFortune());
    }
}
