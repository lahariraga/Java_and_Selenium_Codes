package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverClass {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	driver.findElement(By.id("email")).sendKeys("raga");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Yolo@12345");
	wait.until(ExpectedConditions.titleContains("passsword"));
	driver.findElement(By.id("identify_email")).sendKeys("ragakadimisetty@gmail.com");
	
	
	

	}

}
