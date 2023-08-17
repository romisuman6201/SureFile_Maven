package com.dropdown;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsWithoutDupInMtr {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ujjwa/OneDrive/Desktop/Hotelmenu.html");
		Select s=new Select(driver.findElement(By.id("mtr")));
		List<WebElement> options = s.getOptions();
		Set withoutDup=new LinkedHashSet();
		for (Object allop : options) {
			allop.
			
		}
		

}
}