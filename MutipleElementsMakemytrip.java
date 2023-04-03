package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MutipleElementsMakemytrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();
				
		List<WebElement> img_count = driver.findElements(By.tagName("img"));
		List<WebElement> link_count = driver.findElements(By.tagName("a"));

		System.out.println("Number of images in the app are:" +link_count.size());
		System.out.println("Number of links in the app are:" +img_count.size());
		int i;
		for(i=0;i<img_count.size();i++)
		{
			System.out.println(link_count.get(i).getText());
		}
		String link_name = link_count.get(i).getText();
		if(img_count.size()>link_count.size())
		{
			System.out.println("Image count is more than link count");
		}
		else
		{
			System.out.println("Link count is more than image count");
		}
		if(link_name.contains("A")==true)
		{
			System.out.println(link_name);
		}
		driver.close();
	}
	
 
}
