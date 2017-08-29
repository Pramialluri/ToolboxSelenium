import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Toolboxtest {
  @Test
	public void toolboxtest(){
		System.setProperty("webdriver.gecko.driver","/Users/prameela.uddaraju/Downloads/geckodriver");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://web-smartshop-admin.stg.smartshop-services.js-devops.co.uk/");
	    
  }
	
	
}
