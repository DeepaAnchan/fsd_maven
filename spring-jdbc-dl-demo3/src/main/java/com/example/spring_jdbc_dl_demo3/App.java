package com.example.spring_jdbc_dl_demo3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_jdbc_dl_demo3.beans.Coach;
import com.example.spring_jdbc_dl_demo3.beans.CricketCoach;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {

			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach myCoach = context.getBean("cricketCoach", CricketCoach.class);
			System.out.println("Coach Details: "+myCoach.toString());
			System.out.println("Workout plan of the day: " + myCoach.getWorkout());
			System.out.println("Fortune of the day: " + myCoach.getDailyFortune());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

	
		}
	}
}