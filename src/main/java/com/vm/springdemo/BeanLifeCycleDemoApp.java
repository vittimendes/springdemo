package com.vm.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		//print results
		System.out.println(theCoach.getDailyWorkout());


		// close context
		context.close();
	}

}
