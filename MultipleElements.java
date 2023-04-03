package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> link_count = driver.findElements(By.tagName("a"));
		System.out.println("Number of links are:" +link_count.size());
		for(int i=0;i<link_count.size();i++)
		{
			System.out.println(link_count.get(i).getText());
		}
		driver.close();
	}}