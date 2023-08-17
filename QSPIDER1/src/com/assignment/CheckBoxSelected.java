package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelected {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		boolean selectedCheckbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(selectedCheckbox) {
			System.out.println("able to selecte checkbox");
		}else {
			System.out.println("not able to select");
		}
		
		

	}
}