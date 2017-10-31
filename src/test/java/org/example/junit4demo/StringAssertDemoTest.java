package org.example.junit4demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class StringAssertDemoTest {
	
	StringAssertDemo demoObject = new StringAssertDemo("hello");
	
	@BeforeClass
	public static void demoBeforeClass() {
		System.out.println("Running in method annotated with @BeforeClass");
	}
	
	@AfterClass
	public static void demoAfterClass() {
		System.out.println("Running in method annotated with @AfterClass");
	}
	
	@Before
	public void demoBefore() {
		System.out.println("Running in method annotated with @Before");
	}
	
	@After
	public void demoAfter() {
		System.out.println("Running in method annotated with @After");
	}

	@Test
	public void demoAssertEquals() {
		assertEquals("helloworld", demoObject.appendString("world"));
	}
	
	@Test
	public void demoAssertNotEquals() {
		assertNotEquals("worldhello", demoObject.appendString("world"));
	}
	
	@Test
	public void demoAssertNull() {
		demoObject.setMyString(null);
		assertNull("helloworld", demoObject.getMyString());
	}
	
	@Test
	public void demoAssertNotNull() {
		assertNotNull(demoObject.getMyString());
	}
	
	@Ignore
	@Test
	public void demoIgnore() {
		fail("Should never be run");
	}

}