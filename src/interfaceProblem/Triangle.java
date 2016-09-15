package interfaceProblem;

class Triangle implements Polygon 
{

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) 
	{
		if(a == 0 || b == 0 || c == 0)
		{
			throw new ArithmeticException("Triangle side not valid");
		}
		else
		{
			this.a = Math.abs(a);
			this.b = Math.abs(b);
			this.c = Math.abs(c);
		}
	}

	public double area() 
	{
		double s = (a + b + c) / 2.0;
		if((s-a) < 0 || (s-b) < 0 || (s-c) < 0)
		{
			return 0;
		}
		else
		{
			return Math.sqrt(s * (s - a) * (s - b) * (s - c));	
		}
	}

	public double perimeter() 
	{
			return a + b + c;
	}

	public static void main(String args[]) 
	{
		Rectangle rectangle = new Rectangle(0, 7);
		Triangle triangle = new Triangle(0, 2, 3);
		System.out.println("JAVA INTERFACE IMPLEMENTATION\n");
		System.out.println("The area of rectangle is :" + String.format("%.2f",rectangle.area()));
		System.out.println("\nThe perimeter of rectangle is :" + String.format("%.2f",rectangle.perimeter()));
		System.out.println("\nThe area of traingle is :" + String.format("%.2f",triangle.area()));
		System.out.println("\nThe perimeter of triangle is :" + String.format("%.2f",triangle.perimeter()));
	}
}

