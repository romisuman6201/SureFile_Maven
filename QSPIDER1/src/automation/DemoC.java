package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoC {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_0_qi")).click();
		driver.findElement(By.name("firstname")).sendKeys("romisuman");
		driver.findElement(By.name("lastname")).sendKeys("gupta");
		driver.findElement(By.id("u_3_g_VE")).sendKeys("9791010856");

	}

}
