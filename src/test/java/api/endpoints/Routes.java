package api.endpoints;

/* swagger url : https://petstore.swagger.io/
 * Base URL: petstore.swagger.io/v2
 * USER Model:
 * create user: https://petstore.swagger.io/v2/user
 * Get user : https://petstore.swagger.io/v2/user/{user_name}
 * Update user : https://petstore.swagger.io/v2/user/{user_name}
 * Delete user : https://petstore.swagger.io/v2/user/{user_name}
 */

public class Routes {
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	//User module
	
	public static String post_url = base_url+"/user";
	public static String get_url =  base_url+"/user/{user_name}";
	public static String update_url  =  base_url+"/user/{user_name}";
	public static String delete_url  =  base_url+"/user/{user_name}";
	
	//store module urls
	//pet module urls

}
