package projectMaven.BramptonMVNProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	public void connectDB(){
		System.out.println("Connecting to DB");
	}
	
	@AfterTest
	public void disconnectDB(){
		System.out.println("Disconnecting DB");
	}
	
	@BeforeClass
	public void openBrowser(){
		System.out.println("Opening Browser");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("Closing Browser");
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("Logging in");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("Logging out");
	}
	
	@Test
	public void booking(){
		//Searching
		//Selecting Date
		//Selecting which fliht to travel
		//Provioding CC details
		//Checking if ticket is  booked
		System.out.println("Booking Tickets");
	}
	
	@Test
	public void cancel(){
		System.out.println("Cancelling Tickets");
	}

}
