package com.greatlearning.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springdemo.sports.ExpertAdvice;
import com.springdemo.sports.FootBallCoach;
import com.springdemo.sports.PracticeAdvice;
import com.springdemo.sports.SportsCoach;

@Configuration
@ComponentScan("com.springdemo.sports")
public class springConfig {
	
	@Bean
	public ExpertAdvice practiceAdvice() {
		return new PracticeAdvice();
	}
	
	@Bean
	public SportsCoach footballCoach() {
		return new FootBallCoach();
	}
	

}
