package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	// driver.findElement(By.xpath("//*[text()='Create new account']")).click();
	
	 ///Uisng select class
	 
	 Select obj = new Select(driver.findElement(By.id("day")));
	 obj.selectByIndex(28);
		//driver.close();
	 
	 Select obj1 = new Select(driver.findElement(By.id("month")));
	 obj1.selectByValue("9");
	 
	 Select obj2 = new Select(driver.findElement(By.id("year")));
	 obj2.selectByVisibleText("1996");
}}

