package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintJavaAutoSuggestion {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("(//span[contains(.,'java')])"));
		int count = allSugg.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String allSuggText = allSugg.get(i).getText();
			System.out.println(allSuggText);

		}
		allSugg.get(count-1).click();
	
	}
	
}