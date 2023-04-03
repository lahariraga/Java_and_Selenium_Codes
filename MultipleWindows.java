package sample1;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindows {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
					driver.manage().window().maximize();
					String parenthandle = driver.getWindowHandle();
					System.out.println("Parent handle is"+parenthandle);
					driver.findElement(By.id("newWindowsBtn")).click();
					Set<String> handles = driver.getWindowHandles();
					for(String handle:handles)
					{
						System.out.println(handle);
					}
					driver.quit();
				
	}

}
