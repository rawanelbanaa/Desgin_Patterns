package cinema2;
import java.util.Scanner;


public class main_packages {
String[] names = {"You have got mail", " my name is Khan", "Matilda"};
	
	
	Scanner input = new Scanner(System.in);
	
	public void print() {
		System.lineSeparator();
		 
		System.out.print(
				System.lineSeparator()+
				"1)You have got mail " +
				System.lineSeparator()
				+ "2) my name is Khan " +
				System.lineSeparator()
				+ "3) Matilda " +
				System.lineSeparator()
				+ "Enter number of film do you want to book it: ");
				int film_num = input.nextInt();
//				make a object from all packages to user choose one.
//				to print name of film if u want
	System.out.print(names[film_num]);	
	}
	
}

