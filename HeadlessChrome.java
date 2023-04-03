package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.facebook.com/login/");
			System.out.println("Title of the page:"+driver.getTitle());
			
			driver.manage().window().maximize();

	}

}
