public class Rectangle
{
  private Point origin;
  private int width;
  private int height;
  
  //constructor
  public Rectangle()
  {
    origin =new Point();
    width=0;
    height=0;
  }
  
  public Rectangle(Point bottomLeft, Point topRight)
  {
    origin=bottomLeft;
    width=topRight.getX()-bottomLeft.getX();
    height=topRight.getY()-bottomLeft.getY();
  }
  
  public Rectangle(Point bottomLeft, int tx, int ty)
  {
    origin=bottomLeft;
    width=tx;
    height=ty;
  }
  
  //accessor
  public Point getBottomLeft()
  {
    return origin;
  }
  
  public Point getTopRight()
  {
    Point TopRight = new Point(origin.getX()+width, origin.getY()+height);
    return TopRight;
  }
  
  public Integer getHeight()
  {
    return height;
  }
  
  public Integer getWidth()
  {
    return width;
  }
  
  public double area()
  {
    double a=height*width;
    return a;
  }
  
  public double diagonal()
  {
    double b=origin.distance(getTopRight());
    return b;
  }
  
  public Integer perimeter()
  {
    int c=(height*2)+(width*2);
    return c;
  }
  
  public boolean isSquare()
  {
    if(height==width)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public String toString()
  {
    return "[ "+origin.toString()+","+getTopRight().toString()+"]";
  }
  
  //mutator
  public void translate(int X, int Y)
  {
    origin.translate(X, Y);
  }
  
  public void scale(int dx, int dy)
  {
    height+= dy;
    width+= dx;
  }
}
