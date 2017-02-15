
public class TestAccount 
{
	public static void main(String[] arg)
	{
		Account A1 = new Account("FirstAccount","Sachin");
		System.out.println(A1);
		
		Account A2 = new Account("SecondAccount","Vijay",12345678);
		System.out.println(A2);
		
		System.out.println(A1.getBalance());
		
		A2.debit(500);
		System.out.println(A2);
		
		A1.credit(500);
		System.out.println(A1);
		
		A2.transfer(1000);
		System.out.println(A2);
		
		A1.debit(600);
		System.out.println(A1);
		
		A1.credit(500);
		System.out.println(A1);
		
		A1.transfer(1500);
		System.out.println(A1);
		
	}

}
