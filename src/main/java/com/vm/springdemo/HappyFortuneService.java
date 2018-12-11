package com.vm.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] myFortunes = {"Today is your lucky day", "Today is not a good day", "Maybe you should consider a light day"};
	
	public String getFortune() {
		int idx = new Random().nextInt(myFortunes.length);
		return (myFortunes[idx]);
	}

}
