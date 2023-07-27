package Ecommers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class flipkart {
  @Test
  public void flipkartTest() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("opening Flipcart",true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(5000);
	  driver.close();
  }
}
