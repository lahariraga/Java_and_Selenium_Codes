package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
        a.sendKeys(Keys.F5).build().perform();
    	Thread.sleep(2000);
		a.sendKeys(Keys.CONTROL+"t").build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.CONTROL+"n").build().perform();
     
	}

}
