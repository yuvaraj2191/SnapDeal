package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapDeal {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F://java//workspace//ExcelRead2//Driver//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		
		WebElement search=d.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("iphone");

		WebElement clk=d.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));

		clk.click();

		WebElement c=d.findElement(By.xpath("(//a[@class='dp-widget-link hashAdded'])[1]"));

		c.click();

		String parent=d.getWindowHandle();
		Set<String> child=d.getWindowHandles();

		for(String x:child)
		{
		if(!x.equals(parent))
		d.switchTo().window(x);

		}

		WebElement ad=d.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		ad.click();



		}


		


		
	}
	

