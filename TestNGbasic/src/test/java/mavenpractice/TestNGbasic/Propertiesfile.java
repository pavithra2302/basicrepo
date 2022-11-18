package mavenpractice.TestNGbasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertiesfile {
	
	public static void read() throws FileNotFoundException, IOException{
	Properties prop = new Properties();
	prop.load(new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\TestNGbasic\\src\\test\\java\\mavenpractice\\TestNGbasic\\config.maven"));
	
	String property = prop.getProperty("URL");
	//String property2 = prop.getProperty("password");
	//String property3 = prop.getProperty("URL");
	
	WebDriver driver = new ChromeDriver();
	driver.get("Property");
	
	WebElement a = driver.findElement(By.name("q"));
	a.sendKeys(prop.getProperty("search")+Keys.ENTER);
     
}
}