package projectMaven.BramptonMVNProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingTickets {
	@Test(priority = 1)
	public void login(){
		Assert.assertTrue(true);
		System.out.println("Logging in");
		
	}
	
	@Test(dependsOnMethods = "login")
	public void logout(){
		System.out.println("Booking");
	}
	

}
