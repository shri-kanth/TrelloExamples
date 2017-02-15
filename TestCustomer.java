
public class TestCustomer 
{
	public static void main(String[] arg)
	{
		Customer c1 = new Customer(54,"Raja",13);
		
		System.out.println(c1.getID());
		System.out.println(c1.getName());
		System.out.println(c1.getDiscount());
		
		c1.setDiscount(15);
		
		System.out.println(c1.getDiscount());
		
		System.out.println(c1);
	}
	

}
