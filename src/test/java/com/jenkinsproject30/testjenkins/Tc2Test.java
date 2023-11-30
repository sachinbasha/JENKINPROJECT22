package com.jenkinsproject30.testjenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc2Test
{
	@Test(groups="regression")
	public void test3()
	{
		System.out.println("regression 2");
		
		
	}
	@Test(groups="smoke")
	public void test4()
	{
		System.out.println("smokeTest 2");
		
	}

}
