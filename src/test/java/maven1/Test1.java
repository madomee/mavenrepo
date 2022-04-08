package maven1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//coment


public class Test1 extends Base {
	Login1 lp;
	@BeforeClass
	public void bclass() {
		lp=new Login1(driver);
	}
@Test
public void log() throws InterruptedException {

	lp.un().sendKeys("admin");
	lp.pw().sendKeys("admin123");
	lp.bn().click();
	
}


	
	
}


