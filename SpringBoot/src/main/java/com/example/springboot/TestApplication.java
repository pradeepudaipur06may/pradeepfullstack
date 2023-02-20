package com.example.springboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class TestApplication {

	private String name;

	public String getName() {
		return name;
	}

	public TestApplication() {
		super();
		System.out.println("Object Created");
	}

	public void setName(String name) {
		this.name = name;
	}
}
