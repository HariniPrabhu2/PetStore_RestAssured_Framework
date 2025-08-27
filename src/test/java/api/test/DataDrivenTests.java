package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DataDrivenTests {
	
	User userPayload;
	public Logger logger;
	
	@BeforeClass
	public void setup(){
		
		//Logs
		 logger = LogManager.getLogger(this.getClass());
		
	}
	
	//create multiple post requests with different data sets
	@Test(priority = 1, dataProvider = "data", dataProviderClass = DataProviders.class)
	public void testCreateUsers(String userId, String userName, String firstName, 
			String lastName, String email, String password, String phone) {
		
		logger.info("Creating User");
		
		userPayload = new User();
		userPayload.setId((Integer.parseInt(userId)));
		userPayload.setFirstName(firstName);
		userPayload.setLastName(lastName);
		userPayload.setEmail(email);
		userPayload.setPassword(password);
		userPayload.setPhone(phone);
		userPayload.setUsername(userName);
		
		Response response = UserEndPoints.createUser(userPayload);
		response.then().log().all();
		 
		Assert.assertEquals(response.getStatusCode(), 200);
		 
		logger.info("User is created");
		
	}
	
	//delete all the created users by its username to clear down
	
	@Test(priority = 2, dataProvider = "userNames", dataProviderClass = DataProviders.class)
	public void deleteUsersbyName(String userName) {
		
		logger.info("Deleting user");
		 
		Response response = UserEndPoints.deleteUser(userName);
		 
		Assert.assertEquals(response.getStatusCode(), 200);
		 
		logger.info("User is deleted");
	}

}
