import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowerOpen {
@Test
	public void browseropen(){
		System.setProperty("Webdriver.gecko.driver","/Users/prameela.uddaraju/Downloads/geckodriver");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.uk/");
		
		
	}
}
