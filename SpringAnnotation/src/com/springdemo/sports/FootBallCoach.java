package com.springdemo.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements SportsCoach{
	
	@Autowired
	private ExpertAdvice expertAdvice;
	
//	public ExpertAdvice getExpertAdvice() {
//		return expertAdvice;
//	}
//	
//	
//	
//	
//	public void setExpertAdvice(ExpertAdvice expertAdvice) {
//		this.expertAdvice = expertAdvice;
//	}
	

	@Override
	public String getSchedule() {
		
		return "Football schedule at 6 pm";
	}

	
	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
//		return getExpertAdvice().getExpertAdvice();
		return expertAdvice.getExpertAdvice();
	}
	
	

}
