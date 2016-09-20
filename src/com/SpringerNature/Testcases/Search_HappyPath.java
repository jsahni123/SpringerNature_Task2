package com.SpringerNature.Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/*This test is a happy path scenario in  which we are trying to search for Books keyword 
 and verifying the result appears*/ 

@Test
public class Search_HappyPath {

	WebDriver driver = null;

	public void search_function_happypath()	

	{
		boolean SearchSuccess = false;
		driver = new FirefoxDriver();
		driver.get("http://link.springer.com");
		driver.findElement(By.id("query")).sendKeys("Books");
		driver.findElement(By.id("search")).click();
		WebElement searchResult = driver.findElement(By.xpath("//*[@id='kb-nav--main']/div[1]/h1"));
		if (searchResult.isDisplayed()){
			SearchSuccess = true;
		}
		
			Assert.assertEquals(SearchSuccess, true);
			
		}
	}




