package interfaceProblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TraingleTest 
{
	@Test
	public void zeroSideTriangle()
	{
		Triangle triangle = new Triangle(0,2,3);
		assertFalse(triangle.area() == 0 && triangle.perimeter() == 0);
	}
	
	@Test
	public void zeroSideRectangle()
	{
		Rectangle rectangle = new Rectangle(0,7);
		assertTrue(rectangle.area() == 0 && rectangle.perimeter() == 0);
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
		assertTrue(triangle.area() == 0 && triangle.perimeter() == 0);
	}
	
	@Test
	public void negativeSideRectangle()
	{
		Rectangle rectangle = new Rectangle(-8,7);
		assertTrue(rectangle.area() == 0 && rectangle.perimeter() == 0);
	}

}
