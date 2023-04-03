package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	 //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("RagaLahari@123");
	// driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("RagaLahari");
	// driver.findElement(By.xpath("//button[@name='login']")).click();
		WebElement createaccount =  driver.findElement(By.id("u_0_0_jI"));
	 //driver.close();
	 

	}
	
}
