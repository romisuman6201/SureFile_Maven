package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsFromMtr {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ujjwa/OneDrive/Desktop/Hotelmenu.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrList);
		List<WebElement> allOptions = s.getOptions();
		for (WebElement options : allOptions) {
			String text = options.getText();
			System.out.println(text);
		}
	
		
		

	}
}