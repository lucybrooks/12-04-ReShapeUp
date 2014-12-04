public class Point
{
  private int x;
  private int y;
  
  //Accessors
  public int getX()
  { 
    return x;
  }
  public int getY()
  {
    return y;
  }
  public double distanceFromOrigin() 
  {
    return Math.sqrt(x * x + y * y);
  }
  public double distance(Point p)
  {
    double d=Math.sqrt(((x-p.getX())*(x-p.getX()))+((y-p.getY())*(y-p.getY())));
    return d;
  }
  public String toString()
  {
    return "("+x+","+y+")";
  }
  
  //Mutators
  public void setX(int newX)
  {
    x=newX;
  }
  public void setY(int newY)
  {
    y=newY;
  }
  public void translate(int dx, int dy) 
  {
    x += dx;
    y += dy;
  }
  
  //Contructor
  public Point()
  {
    x=0;
    y=0;
  }
  public Point(int x, int y)
  {
    Point end = new Point();
    end.setX(x);
    end.setY(y);
  }
}
