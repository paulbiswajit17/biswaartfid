package Day1Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("page title is :" + driver.getTitle());
		
	//	ChromeOptions options= new ChromeOptions();
	//	WebElement srcbox= driver.findElement(By.id("APjFqb"));
	//	WebElement srcbox= driver.findElement(By.name("q"));
	//	WebElement srcbox= driver.findElement(By.className("gLFyf"));
		WebElement srcbox= driver.findElement(By.tagName("textarea"));
		srcbox.sendKeys("Hello");
		srcbox.sendKeys(Keys.ENTER);
		System.out.println("page title is :" + driver.getTitle());
		
		
		
		
		
		

	}

}
