package projectMaven.BramptonMVNProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNGCodeforFB {
	
	@Test
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\ClassTraining\\Selenium\\Programs\\BramptonMVNProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		//Assert.assertTrue(false);
		String appTitle = driver.getTitle();
		Assert.assertEquals(appTitle, "Facebook - Log In");
	}

}
