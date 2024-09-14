package buy;
//narges fayazBakhsh
//9815091026
public abstract class Product {
	protected final long code;
	protected final int price;
	protected final int ProtuctType;
	protected int quantity;
	protected int sum;
	protected int number;
	
	public Product(long code,int price,int ProtuctType,int quantity)
	{
		this.code=code;
		this.price=price;
		this.ProtuctType=ProtuctType;
		this.quantity=quantity;
	}
	
	public void showFactor(int number)
	{
	}
	public abstract void print();
	
}
