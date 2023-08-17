package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionAlphabetical {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ujjwa/OneDrive/Desktop/Hotelmenu.html");
		WebElement allOptions = driver.findElement(By.id("slv"));
		Select s=new Select(allOptions);
		ArrayList al=new ArrayList();
		Collections.sort();

}
}