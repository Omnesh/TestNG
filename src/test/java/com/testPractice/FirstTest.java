package com.testPractice;

import org.testng.annotations.Test;

public class FirstTest {

	// Run all the test in alphabetic order(ASCII)
	@Test
	public void testGoogle() throws InterruptedException {
		System.out.println("Google testted successfully");
	}

	@Test
	public void testFaceBook() throws InterruptedException {
		System.out.println("Facebook testted successfully");
	}

}
