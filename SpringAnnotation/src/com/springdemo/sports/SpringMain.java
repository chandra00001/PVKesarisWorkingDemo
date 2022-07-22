package com.springdemo.sports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greatlearning.springConfig.springConfig;



//import com.springdemo.springConfig.SpringCongfig;

public class SpringMain {

	public static void main(String[] args) {
		 		
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(springConfig.class);
		
		System.out.println("---------------- Cricket Coach ----------------");
		SportsCoach sp = ctx.getBean("cricketCoach",SportsCoach.class);
		System.out.println(sp.getSchedule());
		System.out.println(sp.getAdvice());
		
		
		System.out.println("---------------- Football Coach ----------------");
		sp = ctx.getBean("footballCoach",SportsCoach.class);
		System.out.println(sp.getSchedule());
		System.out.println(sp.getAdvice());
		
	}

}
