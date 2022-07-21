package com.flipkart.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beforeScene() {
		System.out.println("Before Scene");
	}
	
	@After
	public void afterScene() {
		System.out.println("After scene");
	}
	

}
