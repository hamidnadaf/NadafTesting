package Ecommers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntraTest() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("opening Myntra",true);
	  driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=Cj0KCQjw5f2lBhCkARIsAHeTvlhSs87wtn5vV2H4aAVzHouxSTOTzyCDM6Yw_lhXbZqA2IxrIjNpHb4aAtN6EALw_wcB");
	  Thread.sleep(5000);
	  driver.close();
  }
}
