package Day1Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayMethodTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		System.out.println("page title is :" + driver.getTitle());
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		
		
		
	//	String strplaceholder= driver.findElement(By.id("searchBar").)
		
	//	WebElement CloseIcon= driver.findElement(By.cssSelector("a[title='Clear text']"));
	//	System.out.println(CloseIcon.isDisplayed());
		{
			if (CloseIcon.isDisplayed())
				CloseIcon.click();		
			}
				

	}

}
