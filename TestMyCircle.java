import compositionInheritanceComparision.Point;

public class TestMyCircle 
{
	public static void main(String[] arg)
	{
		MyCircle c1 = new MyCircle();
		
		System.out.println(c1);
		
		c1.setCenterX(2);
		c1.setCenterY(3);
		c1.setRadius(6);
		
		System.out.println(c1);
		
		Point p1 = new Point(4,9);
		
		c1.setCenterXY(5, 11);
		System.out.println("Center : "+c1.getCenter()+" Radius :"+c1.getRadius()+" Circumference : "+c1.getCircumference()+" Area : "+c1.getArea());
		
		c1.setCenter(p1);
		System.out.println(c1);
		
		MyCircle c2 = new MyCircle();
		System.out.println(c2);
		
		System.out.println(c1.distance(c2));
		
		
		
	}
	

}
