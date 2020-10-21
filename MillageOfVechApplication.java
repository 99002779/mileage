package com.ltts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ltts.millage.VehicleDetails;

@SpringBootApplication
public class MillageOfVechApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MillageOfVechApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		VehicleDetails vd=context.getBean(VehicleDetails.class);
		vd.getMileage("b");
	}

}
