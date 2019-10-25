package com.example.spring_jdbc_dl_demo3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class CricketCoach implements Coach {

	

	private FortuneService fortune;

	public CricketCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CricketCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}
	
	
	@Autowired
	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}

	@Override
	public String toString() {
		return "CricketCoach [fortune=" + fortune + "]";
	}

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
