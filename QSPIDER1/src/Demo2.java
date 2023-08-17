
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")).click();
		String s = driver.getTitle();
		if(s.equals("Gmail: Private and secure email at no cost")) {
			System.out.println("Gmail Available");
		}
		else {
			System.out.println("invalid gmail");
		}
		
	}

}
