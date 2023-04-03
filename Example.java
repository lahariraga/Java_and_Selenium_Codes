package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
	
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://docs.oracle.com/javase/7/docs/api/");
   driver.manage().window().maximize();

	}

}


