package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import maven1.Base;

public class Listners extends Base implements ITestListener{
Srnshot sc;
	@Override
	public void onTestFailure(ITestResult result) {
		sc=new Srnshot();
		String name=result.getName();
		
		try {
			sc.screenshot(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
