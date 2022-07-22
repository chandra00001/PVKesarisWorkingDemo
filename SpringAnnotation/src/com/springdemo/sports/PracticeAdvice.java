package com.springdemo.sports;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvice implements ExpertAdvice{

	@Override
	public String getExpertAdvice() {
		// TODO Auto-generated method stub
		return "Practice 4 hrs atleast per day";
	}

}
