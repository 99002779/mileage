package com.ltts.millage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
	@Autowired
	@Qualifier("bike")
	MileCalculator bike;
	@Autowired
	@Qualifier("car")
	MileCalculator car;
	public void getMileage(String choice) {
		if(choice=="b") {
			bike.showMileage();
		}
		else {
			car.showMileage();
		}
			
	}

}
