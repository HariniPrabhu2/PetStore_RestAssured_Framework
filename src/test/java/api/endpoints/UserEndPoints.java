package api.endpoints;
import static io.restassured.RestAssured.*;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//created to perform Create, Retrieve,  Update, Delete Requests for the user API

public class UserEndPoints {
	
	public static ResourceBundle getURL() {
		
		//to load the URLS from Routes.properties file
		ResourceBundle Routes = ResourceBundle.getBundle("Routes");
		return Routes;	
		
	}
	
	//POST Request implementation
	public static Response createUser(User payload) {
		
		String post_url = getURL().getString("post_url"); // get the key- value from properties file
		
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				 .post(post_url);
		return response;
		
		
	}
	
	//GET Request implementation
		public static Response readUser(String userName) {
			
			String get_url = getURL().getString("get_url"); // get the key- value from properties file
			
			Response response = given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.pathParam("user_name", userName)
					.when()
					 .get(get_url);
			return response;
			
		}
	
		//PUT Request implementation
		public static Response updateUser(String userName ,User payload) {
			
			String update_url = getURL().getString("update_url"); // get the key- value from properties file
			
			Response response = given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.pathParam("user_name", userName)
					.body(payload)
					.when()
					 .put(update_url);
			return response;
			
		}
	    
		
		//DELETE Request implementation
		public static Response deleteUser(String userName) {
			
			String delete_url = getURL().getString("delete_url"); // get the key- value from properties file
					
					Response response = given()
							.pathParam("user_name", userName)
							
							.when()
							 .delete(delete_url);
					return response;
					
				}

}
