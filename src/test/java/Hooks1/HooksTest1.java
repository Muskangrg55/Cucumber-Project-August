package Hooks1;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksTest1 {
	
	
	@Before("@Smoke")
	public void setup() {
		System.out.println("Launch the browser - Order 1");
	}
	
	
	@After("@Smoke")
	public void tearDown() {
		System.out.println("Close the browser - Order 2");
	}
	
	@Test
	public void setup1() {
		System.out.println("Launch the browser - Order 2");
	}
	
	
	@Test
	public void tearDown2() {
		System.out.println("Close the browser - Order 2");
	}
	
}