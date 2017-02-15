
public class TestInvoice 
{
	public static void main(String[] arg)
	{
		Customer customer = new Customer(54,"Raja",15);
		Invoice in = new Invoice(32,customer,378.98);
		System.out.println(in.getID());
		System.out.println(in.getCustomerName());
		System.out.println(in.getCustomer());
		System.out.println(in.getAmount());
		in.setAmount(412.78);
		System.out.println(in.getAmount());
		System.out.println(in.getAmountAfterDiscount());
		System.out.println(in.getCustomer());
	}
	

}
