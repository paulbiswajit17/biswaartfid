package Day1Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
		
		WebElement c= driver.findElement(By.xpath("//input[@id='user-message']"));
		c.sendKeys("hello");
		WebElement d= driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
		d.click();		
		Select a = new Select(driver.findElement(By.id("select-demo")));
		a.selectByValue("Tuesday");
		
		/* Select b = new Select(driver.findElement(By.id("multi-select")));
		
		if(b.isMultiple())
		{
			b.selectByIndex(0);
			b.selectByValue("Florida");
			b.selectByVisibleText("Washington");
		}
		
*/		

	}

}
