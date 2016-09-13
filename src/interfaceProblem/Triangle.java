package interfaceProblem;

class Triangle implements Polygon 
{

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area() 
	{
		if(a<0 || b<0 || c<0)
		{
			return 0;
		}
		else
		{
			double s = (a + b + c) / 2.0;
			if((s - a) <= 0 || (s - b) <= 0 || (s - c) <= 0)
			{
				return 0;
			}
			else
			{
				return Math.sqrt(s * (s - a) * (s - b) * (s - c));
			}
		}
	}

	public double perimeter() 
	{
		if(a<0 || b<0 || c<0)
		{
			return 0;
		}
		else
		{
			return a + b + c;
		}
	}

	public static void main(String args[]) 
	{
		Rectangle rectangle = new Rectangle(6, 7);
		Triangle triangle = new Triangle(2.8, 2, 3);
		System.out.println("JAVA INTERFACE IMPLEMENTATION\n");
		System.out.println("The area of rectangle is :" + String.format("%.2f",rectangle.area()));
		System.out.println("\nThe perimeter of rectangle is :" + String.format("%.2f",rectangle.perimeter()));
		System.out.println("\nThe area of traingle is :" + String.format("%.2f",triangle.area()));
		System.out.println("\nThe perimeter of triangle is :" + String.format("%.2f",triangle.perimeter()));
	}
}

