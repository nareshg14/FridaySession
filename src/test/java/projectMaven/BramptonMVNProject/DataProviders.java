package projectMaven.BramptonMVNProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends BaseTest {
	WebDriver driver = null;
	@Test(dataProvider = "provideLoginData")
	public void login(String username, String password) throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\ClassTraining\\Selenium\\Programs\\BramptonMVNProject\\configuration\\config.properties");
		prop.load(fis);
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\ClassTraining\\Selenium\\Downloaded Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\ClassTraining\\Selenium\\Downloaded Files\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(prop.getProperty("browser").equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\ClassTraining\\Selenium\\Downloaded Files\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else{
			System.setProperty("webdriver.gecko.driver", "C:\\ClassTraining\\Selenium\\Downloaded Files\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='wds-button wds-button--stretch wds-button--icon-right wds-button--arrow-right']")).click();
		driver.quit();

	}
	
	@DataProvider
	public Object[][] provideLoginData(){
		Object userDetails[][] = new Object[2][2];
		userDetails[0][0] = "seleniumtraining";
		userDetails[0][1] = "selenium1234";
		userDetails[1][0] = "seleniumtraining1";
		userDetails[1][1] = "selenium1234";
		return userDetails;
	}
	

}
