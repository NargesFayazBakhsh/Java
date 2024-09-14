package buy;
//narges fayazBakhsh
//9815091026
public class mobile extends Product{
	protected String name;

	public mobile(long code,int price,int ProtuctType,int quantity,String name)
	{
		super(code,price,ProtuctType,quantity);
		this.name=name;
	}
	@Override
	public void showFactor(int number)
	{
		super.number=number;
		super.sum = (115 * number * super.price)/100;
	}
	@Override
	public void print()
	{
		System.out.printf("%n%s: %d %n%s: %d %n%s: %s %n%s: %d %n%s: %s %n%s: %d",
				"code",code,"price",price,"ProtuctType","mobile","quantity",super.quantity,"name",name,"sum",super.sum);
		System.out.printf("\n%s: %d","amount your order",super.number);
		super.quantity=super.quantity-super.number;
//		System.out.printf("\nqu:%d", super.quantity);
		System.out.print("\n-------------------------");
	}
}
