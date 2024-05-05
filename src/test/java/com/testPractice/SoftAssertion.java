package com.testPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void test1() {
		System.out.println("Test 1 status before Assertion_1");
		Assert.assertTrue(false);
		System.out.println("Test 1 status after Assertion_1");
		
	}
	
	@Test
	public void test2() {
		
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Test 2 status before Assertion_1");
		softAssert.assertTrue(false,"Making Assertion_1 fail");
		System.out.println("Test 2 status after Assertion_1");
		
		System.out.println("Test 2 status before Assertion_2");
		softAssert.assertTrue(false,"Making Assertion_2 fail");
		System.out.println("Test 2 status after Assertion_2");
		
		System.out.println("Test 2 status before Assertion_3");
		softAssert.assertTrue(true,"Making Assertion_1 pass");
		System.out.println("Test 2 status after Assertion_3");
		
		softAssert.assertAll();
		
		System.out.println("Test 2 status before Assertion_4");
		softAssert.assertTrue(true,"Making Assertion_1 pass");
		System.out.println("Test 2 status after Assertion_4");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3 status before Assertion_1");
	}

}
