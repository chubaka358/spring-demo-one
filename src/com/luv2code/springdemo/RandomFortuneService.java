package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {
	private static String[] fortunes = new String[3];

	static {
		fortunes[0] = "The day will be the best.";
		fortunes[1] = "The day will be the worst.";
		fortunes[2] = "The day will be ordinary.";
	}
	
	@Override
	public String getFortune() {
		return fortunes[(int)(Math.random() * 3)];
	}

}
