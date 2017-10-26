package org.example.junit4demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringAssertDemoTest {
	
	StringAssertDemo demoObject = new StringAssertDemo("hello");

	@Test
	public void verifyAssertEquals() {
		assertEquals("helloworld", demoObject.appendString("world"));
	}
	
	@Test
	public void verifyAssertNotEquals() {
		assertNotEquals("worldhello", demoObject.appendString("world"));
	}

}