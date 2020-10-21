package com.ltts.millage;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator{

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("The milage of the bike is 50km");
	}

}
