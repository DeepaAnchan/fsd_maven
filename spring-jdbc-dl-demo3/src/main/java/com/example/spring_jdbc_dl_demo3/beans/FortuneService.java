package com.example.spring_jdbc_dl_demo3.beans;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements Fortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!!";
	}

	

}
