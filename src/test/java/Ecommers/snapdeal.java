package Ecommers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class snapdeal {
  @Test
  public void snapdealTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.snapdeal.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
