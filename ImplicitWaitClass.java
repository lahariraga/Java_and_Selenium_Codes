package sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitClass {

	public static void main(String[] args) throws Exception {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/login/");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8019375125");
		   
		    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Yolo@12345");
		    	
		    
}
}