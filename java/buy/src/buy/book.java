package buy;
//narges fayazBakhsh
//9815091026
public class book extends Product{

	protected String name;
	protected int page;

	public book(long code,int price,int ProtuctType,int quantity,String name,int page)
	{
		super(code,price,ProtuctType,quantity);
		this.name=name;
		this.page=page;
	}
	@Override
	public void showFactor(int number)
	{
		int d=0;
		if(page<=50)
			d=0;
		if((page<=100)&&(page>50))
			d=1;
		if((page<=300)&&(page>100))
			d=2;
		if(page>300)
			d=5;
		super.sum = ((d+100) * number * super.price)/100;
		super.number=number;
	}
	@Override
	public void print()
	{
		System.out.printf("%n%s: %d %n%s: %d %n%s: %s %n%s: %s%n%s: %s %n%s: %d %n%s: %d",
				"code",code,"price",price,"ProtuctType","book","name",name,"quantity",super.quantity,"page",page,"sum",sum);
		System.out.printf("\n%s: %d","amount your order",super.number);
		System.out.print("\n-------------------------");
	}
}