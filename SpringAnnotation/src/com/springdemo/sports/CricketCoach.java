package com.springdemo.sports;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements SportsCoach{
	
	private ExpertAdvice expertAdvice;
	
	public CricketCoach(ExpertAdvice expertAdvice) {
		this.expertAdvice= expertAdvice;
	}

	@Override
	public String getSchedule() {
		return "Please practice at 5.00pm";
		
		
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getExpertAdvice();
	}

}
