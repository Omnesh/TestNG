package com.testPractice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void checktitle() {
		System.out.println("Validating Title");
		Assert.assertEquals("actual", "expected","Message that is am giving for mismath");
	}
	
	@Test
	public void checkValue() {
		System.out.println("Validating Value Integer");
		Assert.assertEquals(20,20,"validating integer");
	}

	@Test
	public void checkCondition() {
		System.out.println("Validating Condition");
		Assert.assertTrue(9>10,"Failing for conditon");
		assertTrue(true);
	}
}
