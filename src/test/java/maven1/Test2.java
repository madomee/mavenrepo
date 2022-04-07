package maven1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 extends Base {
	Home ho;
	@BeforeClass
	public void bclass() {
	ho=new Home(driver);
	}
	@Test
	public void hom() {
		Assert.assertTrue(false);
		ho.wc().click();
		ho.lt().click();
		
	

}
}