package sample1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSort {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91801\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://testautomationpractice.blogspot.com/");
          driver.manage().window().maximize();
          WebElement dropdown = driver.findElement(By.id("animals"));
		  Select obj = new Select(dropdown);
		  List originalList = new ArrayList();
		  
		  List<WebElement>options = obj.getOptions();
		  for(WebElement e:options)
		  {
			  originalList.add(e.getText());
		  }
		  System.out.println(originalList);
		  
		  List tempList = new ArrayList();
		  tempList = originalList;
		  System.out.println("Before Sorting the values are "+tempList);
		  Collections.sort(tempList);
		  System.out.println("After Sorting the values are "+tempList);
		  
		  if(originalList == tempList)
		  {
			  System.out.println("DropDown is sorted");
		  }
		  else
		  {
			  System.out.println("DropDown is not sorted");
		  }
		  }

}
