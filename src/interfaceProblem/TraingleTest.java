package interfaceProblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TraingleTest 
{
	@Test(expected=ArithmeticException.class)
	public void zeroSideTriangle()
	{
		Triangle triangle = new Triangle(0,2,3);
	}
	
	@Test(expected=ArithmeticException.class)
	public void zeroSideRectangle()
	{
		Rectangle rectangle = new Rectangle(0,7);
	}
	
	@Test
	public void decimalSideTriangle()
	{
		Triangle triangle = new Triangle(2.8,2,3);
		assertTrue(triangle.area() == 2.7084866623263992 && triangle.perimeter() == 7.8);
	}
	
	@Test
	public void decimalSideRectangle()
	{
		Rectangle rectangle = new Rectangle(6.5,7);
		assertTrue(rectangle.area() == 45.5 && rectangle.perimeter() == 27);
	}
	
	@Test
	public void negativeSideTriangle()
	{
		Triangle triangle = new Triangle(-2,2,3);
		assertTrue(triangle.area() == 1.984313483298443 && triangle.perimeter() == 7);
	}
	
	@Test
	public void negativeSideRectangle()
	{
		Rectangle rectangle = new Rectangle(-8,7);
		assertTrue(rectangle.area() == 56 && rectangle.perimeter() == 30);
	}

}
