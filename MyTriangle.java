import compositionInheritanceComparision.Point;

public class MyTriangle 
{
	private Point v1;
	private Point v2;
	private Point v3;

	public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		v1=new Point(x1, y1);
		v2=new Point(x2, y2);
		v3=new Point(x3, y3);
	}
	
	public MyTriangle(Point v1,Point v2,Point v3)
	{
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public double getPerimeter(){
		return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
	}
	
	public String getType()
	{
		double side1 = v1.distance(v2);
		double side2 = v2.distance(v3);
		double side3 = v3.distance(v1);
		
		if(side1==side2)
		{
			if(side1==side3)
				return "Equilateral";
			else
				return "Isosceles";
		}
		else if(side1 == side3)
			return "Isosceles";
		else
			return "Scalen";
		
	}
	
	public String toString()
	{
		return "MyTriangle[v1="+v1+",v2="+v2+",v3="+v3+"]";
	}
	
	public String getSides()
	{
		double side1 = v1.distance(v2);
		double side2 = v2.distance(v3);
		double side3 = v3.distance(v1);
		
		return "Side1 :"+side1+" Side2 :"+side2+" Side3 :"+side3;
		
	}
	
}
