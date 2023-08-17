package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectInReverseOrder {
	static {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ujjwa/OneDrive/Desktop/Hotelmenu.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		for (int i=0;i<size;i++ ){
			s.selectByIndex(i);
			
		}
		for (int i = size-1; i >=0; i--) {
			s.deselectByIndex(i);
		}

	}
}