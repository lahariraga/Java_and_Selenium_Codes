package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginUsingXpath {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.instagram.com/accounts/login/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@name='username']")).sendKeys("lahari.raga");
    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Yolo@123");
    driver.findElement(By.xpath("//*[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();
    driver.close();
    
	}

}
