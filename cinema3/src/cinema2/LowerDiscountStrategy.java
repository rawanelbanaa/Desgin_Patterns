package cinema2;

public class LowerDiscountStrategy implements IStrategy {
	@Override
	public int getFinalBill(int billAmount)
	{ return (int)(billAmount-(billAmount*0.5));}
	}

