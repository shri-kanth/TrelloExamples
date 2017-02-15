package compositionInheritanceComparision;

public class Line 
{
	private Point begin;
	private Point end;
	
	public Line(Point begin,Point end){
		this.begin = begin;
		this.end = end;
	}
	
	public Line(int beginX,int beginY,int endX,int endY){
		begin = new Point(beginX,beginY);
		end = new Point(endX,endY);
	}
	
	public String toString(){
		return "Line [begin ="+begin+",end ="+end+"]";
	}
	
	public Point getBegin(){
		return begin;
	}
	
	public void setBegin(Point begin){
		this.begin = begin;
	}
	
	public Point getEnd(){
		return end;
	}
	
	public void setEnd(Point end){
		this.end = end;
	}
	

	public int getBeginX(){
		return begin.getX();
	}
	
	public int getBeginY(){
		return begin.getY();
	}
	
	public int getEndX(){
		return end.getX();
		
	}
	
	public int getEndY(){
		return end.getY();
	}
	   
	public void setBeginX(int x){
		begin.setX(x);
	}
	
	public void setBeginY(int y){
		begin.setY(y);
	}
	
     public void setBeginXY(int x,int y){
    	 begin.setXY(x, y);
     }
     
	 public void setEndX(int x){
		 end.setX(x);
	 }
	 
	 public void setEndY(int y){
		 end.setY(y);
	 }
	 
	 public void setEndXY(int x,int y){
	      end.setXY(x, y);	 
	 }
	   
	 public double getLength(){
		 return begin.distance(end);
	 } 
	 
	 public double getGradient()
	 {
		 double x_diff = begin.getX()-end.getX();
		 double y_diff = begin.getY()-end.getY();
		 
		 return (y_diff)/(x_diff);
	 }

}
