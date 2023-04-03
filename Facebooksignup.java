package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignup {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	driver.findElement(By.name("firstname")).sendKeys("Raga");
	driver.findElement(By.name("lastname")).sendKeys("Kadimisetty");
	driver.findElement(By.name("reg_email__")).sendKeys("Kadimisetty.raga@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Kadimisetty.raga@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Yolo@12345");
	 Select obj = new Select(driver.findElement(By.id("day")));
	 obj.selectByIndex(28);
	 Select obj1 = new Select(driver.findElement(By.id("month")));
	 obj1.selectByValue("9");
	 Select obj2 = new Select(driver.findElement(By.id("year")));
	 obj2.selectByVisibleText("1996");
	 //driver.findElement((By.className("_58mt")));
	 driver.findElement((By.xpath("//label[@class='_58mt']"))).click();;
	driver.findElement(By.name("websubmit")).click();
		
	}

}
