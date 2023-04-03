package sample1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[text()='Where2Go']")).click();
            ArrayList wc = new ArrayList(driver.getWindowHandles());
            Thread.sleep(2000);
            System.out.println(wc.size());
            
            for(int i=0;i<wc.size();i++) {

				String title = driver.switchTo().window((String)wc.get(i)).getTitle();
				System.out.println(title);
				Thread.sleep(2000);
				driver.close();
            }
	}

}
