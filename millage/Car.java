package com.ltts.millage;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator{

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("The milage for the car is 23km");
	}

}
