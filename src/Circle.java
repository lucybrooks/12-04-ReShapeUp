// Lucy Brooks 10Te

public class Circle
  {
    private Point center;
    private double radius;
 
    //construtor
    public Circle()
    {
      center=new Point();
    }
    
    public Circle(Point startpoint, Point endpoint)
    {
      center=startpoint;
      radius=startpoint.distance(endpoint);
    }
    
    public Circle(Point c, double r)
    {
      c=center;
      r=radius;
    }
    
    //accessors
    public double getRadius()
    {
      return radius;
    }
    
    public double area()
    {
      double b=radius*radius*Math.PI;
      return b;
    }
    
    public double circumference()
    {
      double i=radius*2*Math.PI;
      return i;
    }
    
    public double diameter()
    {
      double j=radius*2;
      return j;
    }
    
    public String toString()
    {
      return "["+center.toString()+"] "+radius;
    }
    
    //mutators
    public void translate(int dx, int dy)
    {
      center.translate(dx, dy);
    }
    
    public void changeRadius(double dr)
    {
      radius+= dr;
    }
 }
