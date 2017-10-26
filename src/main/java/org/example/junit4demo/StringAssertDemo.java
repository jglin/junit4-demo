package org.example.junit4demo;

public class StringAssertDemo {
	private String myString;
	
	public StringAssertDemo(String myString) {
		this.myString = myString;
	}
	
	public String appendString(String aString) {
		return myString + aString;
	}

}
