package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsClass {

	public WebDriver driver;
	
	//Create a method to launch the application
	public void launchApp(String url)
	{
		driver = new ChromeDriver();
	    driver.get(url);

		driver.manage().window().maximize();
		
	}

	//Create a method to close the application
	public void closeApp()
	{
	driver.close();
	}
	
	
}
