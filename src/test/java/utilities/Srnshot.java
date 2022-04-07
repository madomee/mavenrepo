package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Srnshot  {
	
	public void screenshot(WebDriver driver,String name) throws IOException {
		TakesScreenshot tss =(TakesScreenshot)driver;
		
		File sourse=tss.getScreenshotAs(OutputType.FILE);
		
		File destination=new File(System.getProperty("user.dir")+"\\screnshot\\"+name+".png");
		
		FileHandler.copy(sourse, destination);
		
		System.out.println("captured");
	}

}
