
public class Circle {
	//public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	private double radius;
	private String color;
	
	//default constructs a circle with default radius and color
	//1st(default) Constructor
	Circle()
	{
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//2nd constructs a circle with the given radius and default color
	Circle(double radius)
	{
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//3rd
	Circle(double radius,String color)
	{
		this.radius = radius;
		this.color = color;
	}
	//return the radius the public getter for private attribute radius
	public double getRadius()
	{
		return this.radius;
	}
	//set for private variable radius
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	//return a self-descriptive string for a circle
	public String toStirng()
	{
		return "Circle[radius= "+radius+", color= "+color+"]";
	}
	//return the area this circle
	public double getArea()
	{
		return Math.PI * Math.pow(radius,2);
	    //return Math.PI * radius * radius;
	}
	
	//return the circumference of this circle
	public double getCirclecumference()
	{
		return 2.0* Math.PI * radius;
	}

}
