package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().forward();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();

	}

}
