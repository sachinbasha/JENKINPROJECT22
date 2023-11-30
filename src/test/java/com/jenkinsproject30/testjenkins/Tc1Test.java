package com.jenkinsproject30.testjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc1Test
{
	@Test(groups="smoke")
	public void test1()
	{
	
	    System.out.println("smoketest 1");
	}
	@Test(groups="regression")
	public void test2()
	{
	
	    System.out.println("regression 1");
	}

}
