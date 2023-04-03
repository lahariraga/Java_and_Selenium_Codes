package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://docs.oracle.com/javase/7/docs/api/");
		 driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.name("packageFrame"));
		List<WebElement>lc = driver.switchTo().frame(f1).findElement(By.tagName("a"));
		 for(int i=0;i<lc.size();i++)
		 {
			 System.out.println(lc.get(i).getText());
		 }

	}

}
