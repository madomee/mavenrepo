package maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement button;

  public Login1(WebDriver driver) {
	  PageFactory.initElements(driver,this);

  }
  public WebElement un() {
	  return username;
}
  public WebElement pw() {
	  return password;
}
  public WebElement bn() {
	  return button;
}
  
}
