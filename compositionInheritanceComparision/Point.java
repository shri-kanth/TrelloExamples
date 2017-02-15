package compositionInheritanceComparision;

public class Point 
{
	private int x;
	private int y;
	
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int[] getXY(){
		int[] a = {x,y};
		return a;
	}
	
	public void setXY(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}

	public double distance(int x,int y)
	{
		return Math.sqrt(Math.pow((Math.abs(this.x-x)),2)+Math.pow((Math.abs(this.y-y)),2));
		
	}
	
	public double distance(Point another)
	{
		return Math.sqrt(Math.pow((Math.abs(another.x-x)),2)+Math.pow((Math.abs(another.y-y)),2));
		
	}
	
	public double distance()
	{
		return Math.sqrt(Math.pow((Math.abs(x)),2)+Math.pow((Math.abs(y)),2));
		
	}
}
