package cinema2;
import java.util.Scanner;


public class register {
      Scanner input = new Scanner(System.in);
	
	   public void print() {
		System.out.print("Enter your name:");
		String name = input.nextLine(); 
		System.out.print("Enter your password:");
		String password = input.nextLine(); 
		System.out.print("Enter your visa Card:");
		int visa_Card = input.nextInt(); 
		dataBase db2 = new dataBase();
		boolean result_register = db2.checkRegister(name,password,visa_Card);
		if(result_register) {
			System.out.print("You have register before!");
			 
			 
		                    }
		else {
			System.out.print("Hello in Our packages");
			 
			main_packages main = new main_packages();
			main.print();
		     }	  

	                       }
	

                       }

