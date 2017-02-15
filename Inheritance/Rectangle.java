package Inheritance;

public class Rectangle extends Shape
{
	protected double length;
	protected double width;
	
	public Rectangle()
	{
		super();
		length = 1.0;
		 width =  1.0;
	}
	
	public Rectangle(double width, double length)
	{
		super();
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(double width, double length,String color,boolean filled)
	{
		super(color,filled);
		this.length = length;
		this.width = width;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getArea(){
		return length*width;
	}
	
	public double getPerimeter(){
	    return 2*(length+width);	
	}
	
	@Override
	public String toString(){
        return "Rectangle [length ="+length+" width ="+width+" color ="+getColor()+" filled"+isFilled()+"]";		
	}
}
