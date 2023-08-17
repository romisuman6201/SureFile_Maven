package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int h2 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int w1 = driver.findElement(By.id("username")).getSize().getWidth();
		int w2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		if(h1==h2 && w1==w2) {
			System.out.println("height and weight is equal");
		}else {
			System.out.println("height and weight is not equal");
		}
		driver.close();
		
		

	}
}