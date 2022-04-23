package cinema2;
import java.util.Scanner;

             public class singelton {
	 // Declaring a variable of type String
   // private static singleton Unique instance;
    private static singelton single_instance = null;
	 //Scanner input = new Scanner(System.in);

	    // Constructor
	    private singelton() {}
	    
    public static singelton getinstance() 
    {
   	 
   	 if (single_instance == null)
      single_instance = new singelton();
 
   	  return single_instance;
    }
   	
    public static void getlogin()
    {
   	 {
   		 Scanner input = new Scanner(System.in);

   	    System.out.print("Enter your name:");
			String name = input.nextLine(); 
			System.out.print("Enter your password:");
			String password = input.nextLine(); 
			dataBase db2 = new dataBase();
			boolean result_login =  db2.checkLogin(name, password);
			if(result_login)
			{
				System.out.print("Hello in Our packages");
				main_packages main = new main_packages();
				main.print();
			}
			else {
				System.out.print("You Are not have an acount Or username and password invalid");
			}
		
   	 
   	 
    }
    
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
	    
	 