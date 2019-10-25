package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import lombok.Setter;


public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private Fortune fortune;

	@Override
	public String getWorkout() {
		return "practice batting today";	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune().toString();
	}
	
	
	

}
