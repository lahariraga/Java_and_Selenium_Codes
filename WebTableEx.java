package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String args[])
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://money.rediff.com/sectors/bse/bankex");
		 driver.manage().window().maximize();
	WebElement Datatable = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody"));
		 List<WebElement> tr = Datatable.findElements(By.tagName("tr"));
		 List<WebElement> th = Datatable.findElements(By.tagName("th"));
		 List<WebElement> td = Datatable.findElements(By.tagName("td"));
		 System.out.println(tr.size());
		 System.out.println(th.size());
		 System.out.println(td.size());
	}
}
