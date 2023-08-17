package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheUrl {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.selenium.dev";
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("url is succefully navigating and pass");
		} else {
			System.out.println("fail to navigate");
		}
		driver.close();
	}

}
