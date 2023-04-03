package sample1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 
		 //click on sign in button
		 driver.findElement(By.name("proceed")).click();
		
		 //importing alert message
		 Alert a = driver.switchTo().alert();
		 
		 //close the alert message
		 a.dismiss();

	}

}
