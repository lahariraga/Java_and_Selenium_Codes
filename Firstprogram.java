package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	String title = driver. getTitle ();
    System.out.println(title.length());
    int s1=title.length();
    String url = driver.getCurrentUrl();
    System.out.println(url.length()); 
    int s2 = url.length();
    if(s1<s2)
    {
    	System.out.println("Length of the title is not less than length of thr url");
    }
    else
    {
    	System.out.println("Length of the title is more than length of thr url");
    }
    driver.findElement(By.name("login")).click();
    WebElement loginavailable =  driver.findElement(By.name("login"));
    if(loginavailable.isDisplayed())
    {
    	System.out.println("Login button is available");
    }
    driver.findElement(By.id("loginname")).click();
    WebElement loginenable =  driver.findElement(By.id("loginname"));
    if(loginenable.isEnabled())
    {
    	System.out.println("Pass");
    }
    WebElement forgotpassword = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
    forgotpassword.click();
	}}