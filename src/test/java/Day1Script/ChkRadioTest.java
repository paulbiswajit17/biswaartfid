package Day1Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkRadioTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		System.out.println("page title is :" + driver.getTitle());
		WebElement age= driver.findElement(By.id("isAgeSelected"));
		
		System.out.println(age.isSelected());
		if (!age.isSelected())
				{
				age.click();
				}
			

	}

}
