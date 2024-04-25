package Day1Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTest {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestingplayground.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Load Delay")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

	}

}
