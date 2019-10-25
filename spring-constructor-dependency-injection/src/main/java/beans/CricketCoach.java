package beans;

import lombok.Setter;

@Setter
public class CricketCoach implements Coach {

	private String email;
	private String teamName;
	private Fortune fortune;
	
	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "practice batting today";	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune().toString();
	}
	
	@Override
	public String toString() {
		return "CricketCoach [email=" + email + ", teamName=" + teamName + "]";
	}

}
