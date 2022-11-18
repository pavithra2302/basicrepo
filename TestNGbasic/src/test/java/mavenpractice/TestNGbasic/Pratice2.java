package mavenpractice.TestNGbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Pratice2 {
	//steaks
@Test(invocationCount=3,threadPoolSize=2)
public void launch() {
WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com");

WebElement d=driver.findElement(By.xpath("//input[@name='q']"));

d.sendKeys("topgun"+Keys.ENTER);


List<WebElement>topgun=driver.findElements(By.xpath("//*[contains(text(),'topgun')]"));

			System.out.println(topgun.size());
		
}
}