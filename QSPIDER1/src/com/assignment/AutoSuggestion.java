package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//span[contains(text(),'selenium']"));
		int count = allLinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text);
		}
		WebElement lastLink = allLinks.get(count-1);
		lastLink.click();

	}
}