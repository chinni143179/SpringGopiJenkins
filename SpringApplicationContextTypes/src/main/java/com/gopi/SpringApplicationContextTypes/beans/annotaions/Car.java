package com.gopi.SpringApplicationContextTypes.beans.annotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine engine;

	public String getEngine() {
		return engine.name;
	}
	
}
