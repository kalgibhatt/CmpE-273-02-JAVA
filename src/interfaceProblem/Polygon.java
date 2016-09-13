package interfaceProblem;

public interface Polygon 
{
	public double area();

	public double perimeter();
}

class Rectangle implements Polygon 
{
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() 
	{
		if(width <= 0 || height <= 0)
		{
			return 0;
		}
		else
		{
			return width * height;
		}
	}

	public double perimeter() 
	{
		if(width <= 0 || height <= 0)
		{
			return 0;
		}
		else
		{
			return 2.0 * (width + height);
		}
	}
}

