package com.vm.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve a bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods
		System.out.println(theCoach.getDailyWorkout());
		
		// call app context
		context.close();

		
	}

}
