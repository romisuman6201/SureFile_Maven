package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoB {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "./Drivers/chromedriver");
	}
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	DemoA a=new DemoA();
	a.testA(driver);

	
	}
}
