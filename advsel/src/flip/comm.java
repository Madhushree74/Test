package flip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class comm 
{

	public static void main(String[] args) throws InterruptedException 
	{

 	   System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
 	  WebDriver driver = new FirefoxDriver();
 	  driver.get("https://www.flipkart.com/");
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("//button[.='✕']")).click();
 	 driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("iphone14");
 	 driver.findElement(By.xpath("//button[@ type='submit']")).click();
 	driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Blue, 128 GB)']")).click();
 	
 	
 	
 	
	/*
	 * String p_id = driver.getWindowHandle(); Set<String> all_id =
	 * driver.getWindowHandles(); Thread.sleep(2000); all_id.remove(p_id);
	 * for(String a:all_id) { driver.switchTo().window(a); driver.close();
	 * 
	 * }
	 */
 	 
 	 
 	   
 	  }

}
