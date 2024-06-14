package com.gopi.SpringApplicationContextTypes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gopi.SpringApplicationContextTypes.beans.CI.Car;
import com.gopi.SpringApplicationContextTypes.beans.CI.Engine;


@SpringBootApplication
public class ApplicationContextSpringCI_Dependency {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
		Car c = context.getBean(Car.class);
		Engine e = c.getEngine();
		System.out.println(e);
	}
}
