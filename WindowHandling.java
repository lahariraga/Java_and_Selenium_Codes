package sample1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[text() = 'Gift Cards']")).click();
			Set<String> windows = driver.getWindowHandles();
			System.out.println(windows.size());
			for(String ref:windows) {
				String title = driver.getTitle();
               System.out.println("Title" +title);			
		driver.quit();
}


	}}
