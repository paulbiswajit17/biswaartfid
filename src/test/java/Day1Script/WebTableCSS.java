package Day1Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCSS {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("page title is :" + driver.getTitle());
		
	//	ChromeOptions options= new ChromeOptions();
	//	WebElement srcbox= driver.findElement(By.id("APjFqb"));
	//	WebElement srcbox= driver.findElement(By.name("q"));
	//	WebElement srcbox= driver.findElement(By.className("gLFyf"));
		WebElement srcbox= driver.findElement(By.id("username"));
		srcbox.sendKeys("tomsmith");
		WebElement srcbox1= driver.findElement(By.id("password"));
		srcbox1.sendKeys("SuperSecretPassword!");
		
		WebElement srcbox2= driver.findElement(By.xpath("//button"));
		srcbox2.sendKeys(Keys.ENTER);
		System.out.println("page title is :" + driver.getTitle());
		
		WebElement srcbox3= driver.findElement(By.xpath("//button"));
		srcbox3.sendKeys(Keys.ENTER);

	}

}
