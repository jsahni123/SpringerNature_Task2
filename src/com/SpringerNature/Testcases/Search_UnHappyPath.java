package com.SpringerNature.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_UnHappyPath {
	
	WebDriver driver = null;
	
	@Test
	public void search_function_unhappypath(){
		boolean SearchBoxSuccess = false;
		driver = new FirefoxDriver();
		driver.get("http://link.springer.com");
		driver.findElement(By.id("register-link")).click();
		WebElement searchbox = driver.findElement(By.id("query"));
		if (searchbox.isDisplayed()){
			SearchBoxSuccess = true;
		}
		
		Assert.assertEquals(SearchBoxSuccess, true);
			
		}
		
		
	}

