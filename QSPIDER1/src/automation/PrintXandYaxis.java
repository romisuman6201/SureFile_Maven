package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintXandYaxis {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		int xAxis = driver.findElement(By.xpath("//button[@name='login']")).getLocation().getX();
		int yAxis = driver.findElement(By.xpath("//button[@name='login']")).getLocation().getY();
		System.out.println(xAxis);
		System.out.println(yAxis);
		driver.close();

	}
	
}