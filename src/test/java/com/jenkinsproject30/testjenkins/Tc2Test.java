package com.jenkinsproject30.testjenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc2Test
{
	@Test
	public void test()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		
	}

}
