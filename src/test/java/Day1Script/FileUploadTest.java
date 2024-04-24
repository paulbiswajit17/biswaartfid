package Day1Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		//to upload a file
		WebElement addfile= driver.findElement(By.xpath("//input[@type='file']"));
		String strpath= System.getProperty("user.dir")+"//abc.png";
		addfile.sendKeys(strpath);
		driver.findElement(By.xpath("//span[@text='Start Upload']")).click();
		//
		
	}

}
