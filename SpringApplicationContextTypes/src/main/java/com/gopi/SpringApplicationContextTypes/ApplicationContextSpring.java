package com.gopi.SpringApplicationContextTypes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gopi.SpringApplicationContextTypes.beans.annotaions.Car;

@SpringBootApplication
public class ApplicationContextSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ApplicationContextSpring.class, args);
		Car c = ctx.getBean(Car.class);
		System.out.println(c.getEngine());
	}
}
