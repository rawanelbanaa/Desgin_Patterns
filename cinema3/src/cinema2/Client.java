package cinema2;

import java.time.DayOfWeek;

public class Client {
bookingCart objbookingCartGeneric=new bookingCart(null);
objbookingCartGeneric.name="new user";
objbookingCartGeneric.billAmount=500;
switch(DateTime.Now.DayOfWeek) {
case SATURDAY:{
objbookingCartGeneric.currentStrategy=new LowerDiscountStrategy();
}
case FRIDAY:{
objbookingCartGeneric.currentStrategy=new HigheDiscountStrategy();	
}

default:
	objbookingCartGeneric.currentStrategy=new NoDiscountStrategy();
	 	
}
	
System.out.println("Final bill"+objbookingCartGeneric.getFinalBill());

}
}
 
