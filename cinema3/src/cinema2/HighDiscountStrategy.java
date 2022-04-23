package cinema2;

public class HighDiscountStrategy implements IStrategy {
@Override
public int getFinalBill(int billAmount)
{ return (int)(billAmount-(billAmount*0.5));}
}
