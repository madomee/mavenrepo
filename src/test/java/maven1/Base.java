package maven1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
//gift from git
public class Base {
	public static WebDriver driver;
	String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
	Properties prp;
	FileInputStream fis;
	//maven comment
	//eclips comment
	@BeforeSuite
	public void login() throws IOException {
		
		WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\madom\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
			driver =new ChromeDriver();
				
			driver.manage().window().maximize();
			prp=new Properties();
	        fis=new FileInputStream(path);
	        prp.load(fis);
	        
				
			driver.get(prp.getProperty("url"));
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
	@AfterSuite
	public void teardown() {
	driver.close();
	}
}
