package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonEnabled {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		boolean btnEnabled = driver.findElement(By.id("loginButton")).isEnabled();
		if(btnEnabled==true) {
			System.out.println("login button is clickable");
		}else {
			System.out.println("login button not clickable");
		}

}
}