package com.example.spring_constructor_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.BaseballCoach;
import beans.Coach;

/*
//Constructor and Setter Injection
public class App 
{
    public static void main( String[] args )
    {
		try {
			
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			BaseballCoach theCoach=context.getBean("coach",BaseballCoach.class);
			System.out.println(theCoach.getWorkout());
			System.out.println(theCoach.getDailyFortune());
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
}

*/

/*

//Setter Injection
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {

			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach myCoach = context.getBean("coach", Coach.class);
			System.out.println("Coach Details: "+myCoach.toString());
			System.out.println("Workout plan of the day: " + myCoach.getWorkout());
			System.out.println("Fortune of the day: " + myCoach.getDailyFortune());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
	
		}
	}
}
  
 */

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {

			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach myCoach = context.getBean("coach", Coach.class);
			System.out.println("Coach Details: "+myCoach.toString());
			System.out.println("Workout plan of the day: " + myCoach.getWorkout());
			System.out.println("Fortune of the day: " + myCoach.getDailyFortune());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
	
		}
	}
}
