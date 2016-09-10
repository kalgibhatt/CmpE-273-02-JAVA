package interfaceProblem;

class Triangle implements Polygon {

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area() {
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public double perimeter() {
		return a + b + c;
	}

	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(4, 7);
		Triangle triangle = new Triangle(5, 12, 13);
		System.out.println("JAVA INTERFACE IMPLEMENTATION\n");
		System.out.println("The area of rectangle is :" + rectangle.area());
		System.out.println("\nThe perimeter of rectangle is :" + rectangle.perimeter());
		System.out.println("\nThe area of traingle is :" + triangle.area());
		System.out.println("\nThe perimeter of triangle is :" + triangle.perimeter());
	}
}

