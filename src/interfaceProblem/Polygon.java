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

	public Rectangle(double width, double height) 
	{
		if(width == 0 || height == 0)
		{
			throw new ArithmeticException("Rectangle side not valid");
		}
		else
		{
			this.width = Math.abs(width);
			this.height = Math.abs(height);
		}
	}

	public double area() 
	{
			return width * height;
	}

	public double perimeter() 
	{
			return 2.0 * (width + height);
	}
}

