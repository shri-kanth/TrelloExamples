import java.util.Arrays;

import compositionInheritanceComparision.Point;

public class TestMyPoint 
{
	public static void main(String[] arg)
	{
		Point[] points = new Point[10];
		for(int i = 0;i < 10; i++)
		{
			points[i] = new Point(i+1,i+1);
		}

		System.out.println(Arrays.toString(points));

	}

}
