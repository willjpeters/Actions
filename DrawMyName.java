package com.qa;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrawMyName
{
	
	public WebDriver driver = null;
	public Actions action = null;
	
	@Before
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	action = new Actions(driver);
	}
	
	@Test
	public void WriteWILL()
	{
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/");
		
		action.moveByOffset(700, 350).clickAndHold().moveByOffset(30, 80).moveByOffset(30, -80).moveByOffset(30, 80).moveByOffset(30, -80).release().perform();
		action.moveByOffset(100, 0).clickAndHold().moveByOffset(0, 80).release().perform();
		action.moveByOffset(100, -80).clickAndHold().moveByOffset(0, 80).moveByOffset(50,0).release().perform();
		action.moveByOffset(100, -80).clickAndHold().moveByOffset(0, 80).moveByOffset(50,0).release().perform();
		
	}
	
	@After
	public void teardown()
	{
		// driver.quit();
	}
	
}