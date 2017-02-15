
public class TestTime 
{
	public static void main(String[] arg)
	{
		Time now = new Time(12,56,2);
		
		System.out.println(now);
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		
		now.setHour(3);
		now.setMinute(39);
		now.setSecond(47);
		
		System.out.println(now);
		
		now.setTime(12,7,89);
		System.out.println(now);
		
		System.out.println(now.nextSecond());
		System.out.println(now.previousSecond());
	}

}
