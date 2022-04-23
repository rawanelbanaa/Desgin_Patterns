package cinema2;

public class NoDiscountStrategy implements IStrategy {
	@Override
	public int getFinalBill(int billAmount)
	{ return billAmount; }
}
