package projectMaven.BramptonMVNProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestNGCode {
	
	@Test
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\ClassTraining\\Selenium\\Programs\\BramptonMVNProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.quit();
	}

}
