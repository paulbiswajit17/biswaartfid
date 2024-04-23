package Day1Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select a = new Select(driver.findElement(By.id("select-demo")));
		a.selectByValue("Tuesday");
		
		Select b = new Select(driver.findElement(By.id("multi-select")));
		
		if(b.isMultiple())
		{
			b.selectByIndex(0);
			b.selectByValue("Florida");
			b.selectByVisibleText("Washington");
		}
		

	}

}
