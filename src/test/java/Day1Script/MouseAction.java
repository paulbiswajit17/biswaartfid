package Day1Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MouseAction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		WebElement btn= driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		

	}

}
