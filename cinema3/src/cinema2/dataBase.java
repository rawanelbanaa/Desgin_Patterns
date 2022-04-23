package cinema2;
import java.util.ArrayList;

 public class dataBase {
	 
	ArrayList<String> names_login = new ArrayList<String>();
	 boolean result;
////	for login
	public boolean checkLogin(String name, String password) {
		
////	Check if the user has an account or not  
		for (String num : names_login) { 		      
	          if(name.equals(num)) {
	        	   result = true;
	                               }
	          
	          else {
	        	   result = false;
	               }
	                                    }	
		         return result;
	                                                          }
////	for register

	public boolean checkRegister(String name,String password, int visa_Card) {
		 for (String num : names_login) { 		      
	          if(name.equals(num)) {
	        	   result = true;        	 
	                               }
	          
	          else {
	        	  names_login.add(name);
	        	   result = false;	  
	                }
	                                    }
		 return result;
	                                                                          }
}

