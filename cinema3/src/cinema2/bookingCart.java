package cinema2;

import java.io.ObjectInputStream.GetField;
 
public class bookingCart {
public String name; {get;set;}
public int billAmount ;{get; set;}
public IStrategy  currentStrategy;
public bookingCart(IStrategy newStrategy) {
	currentStrategy=newStrategy;
}
public int getFinalBill() {
	return currentStrategy.getFinalBill( this.billAmount);
}

}
