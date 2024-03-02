package org.Vtiger.testcases.Organisation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {

	@Test
	public void amazon() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("electronics");
		driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	List<WebElement> sort = driver.findElements(By.xpath("//div[@class='a-popover-inner']/ul/li"));
	for(WebElement i:sort)
	{
		System.out.println(i.getText());
	}
	driver.findElement(By.xpath("//a[@id='s-result-sort-select_2']")).click();
	Thread.sleep(3000);
	WebElement prices = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']/../following-sibling::div/div/div/a/span/span/span[2]"));
//	
//	for(WebElement j:prices)
//	{
//		System.out.println(j.getText());
//	}
//	

System.out.println(prices.getText());	
	
	
	}
}
