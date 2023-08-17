package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOption {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ujjwa/OneDrive/Desktop/Hotelmenu.html");
		WebElement slvList = driver.findElement(By.id("slv"));
		Select s = new Select(slvList);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int count = allSelectedOptions.size();
		System.out.println(count);
		for (WebElement selectedOption : allSelectedOptions) {
			String text = selectedOption.getText();
			System.out.println(text);
		}

	}
}