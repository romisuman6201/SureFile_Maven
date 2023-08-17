package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSizeAndType {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String fontsize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");

		System.out.println(fontsize);

		driver.close();
	}
}