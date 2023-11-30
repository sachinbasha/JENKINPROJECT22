package com.jenkinsproject30.testjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc1Test
{
	@Test
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	   
	   System.out.println("script workin sucsesfully");
	   
	}

}
