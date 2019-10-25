package beans;

import lombok.Setter;

/*

//Constructor Injection
public class BaseballCoach implements Coach {

	
	private Fortune fortune;
	
	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Do 100 pushups";
	}

	public BaseballCoach(Fortune fortune) {
	
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyFortune() {
		return fortune.getFortune().toString();
	}

}
*/

/*
//Setter Injection and use of properties
@Setter
public class BaseballCoach implements Coach {

	private Fortune fortune;

	@Override
	public String getWorkout() {

		return "practice back volley today";
	}

	@Override
	public String getDailyFortune() {

		return fortune.getFortune().toString();
	}

	
}

*/



//Setter Injection and use of property file

@Setter
public class BaseballCoach implements Coach {

	private Fortune fortune;

	@Override
	public String getWorkout() {

		return "practice back volley today";
	}

	@Override
	public String getDailyFortune() {

		return fortune.getFortune().toString();
	}

}