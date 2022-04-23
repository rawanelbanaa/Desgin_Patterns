 package cinema2;

import java.util.Scanner;

public class print {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[]  args) 
	{
		
		System.out.print( "Are you have an acount?");
		String answer = input.nextLine();  
		
		if (answer.equals("Yes") ) 
		{
			singelton LP = singelton.getinstance();
			LP.getlogin();
		}
		
		else if(answer.equals("No")) 
		{
			register register1 = new register();
			register1.print();
		}
		
		else
		{
			System.out.print( "Cant understand your answer!");
		}
	
	

	}
	
}
