package maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home{
	
	@FindBy(id="welcome")
	private WebElement welcom;
	
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logout;
	

	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement wc() {
		
		return welcom;
	}		
		public WebElement lt() {
			
			return logout;
		
	}


}
