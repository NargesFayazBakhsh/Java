package buy;
//narges fayazBakhsh
//9815091026
public class cloth extends Product{
	protected char size;

	public cloth(long code,int price,int ProtuctType,int quantity,char size)
	{
		super(code,price,ProtuctType,quantity);
		this.size=size;
	}
	@Override
	public void showFactor(int number)
	{
		int d=0;
		if(size=='s')
			d=1;
		if(size=='m')
			d=2;
		if(size=='l')
			d=3;
		super.sum = ((d+100) * number * super.price)/100;
		super.number=number;
	}
	@Override
	public void print()
	{
		System.out.printf("%n%s: %d %n%s: %d %n%s: %s %n%s:%d %n%s: %s %n%s: %d",
				"code",code,"price",price,"ProtuctType","cloth","quantity",quantity,"size",size,"sum",sum);
		System.out.printf("\n%s: %d","amount your order",super.number);
		System.out.print("\n-------------------------");
	}

}
