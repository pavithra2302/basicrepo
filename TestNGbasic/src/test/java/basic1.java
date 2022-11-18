

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic1 {
	WebDriver driver = new ChromeDriver();
@BeforeTest
public void launch() {
	driver.get("https://www.google.com");
	System.out.println("chrome launched");
}
@Test
public void search() {
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("topgun"+Keys.ENTER);
}
@AfterTest
public void close() {
	driver.close();
	System.out.println("chrome is closed");
}
}
