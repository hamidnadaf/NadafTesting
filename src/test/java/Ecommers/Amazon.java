package Ecommers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("opening Amazon",true);
	  driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=8141594611108158998&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007789&hvtargid=kwd-10573980&hydadcr=14453_2154373");
	  Thread.sleep(5000);
	  driver.close();
  }
}
