package arrayProblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberSortingTest
{
	@Test
	public void normalTest()
	{	
		int[] numbers = {5,4,9,7,0,8};
		NumberSorting.bubbleSort(numbers);
		int[] expectedOutput = {0,4,5,7,8,9};
		assertArrayEquals(expectedOutput,numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void nullTest()
	{
		int[] numbers = null;
		NumberSorting.bubbleSort(numbers);
	}
	
	@Test
	public void oneNumberTest()
	{
		int[] numbers ={5};
		NumberSorting.bubbleSort(numbers);
		int[] expectedOutput = {5};
		assertArrayEquals(expectedOutput,numbers);
	}
	
	@Test
	public void lowestToHighestTest()
	{
		int[] numbers ={5,24,78};
		NumberSorting.bubbleSort(numbers);
		int[] expectedOutput = {5,24,78};
		assertArrayEquals(expectedOutput,numbers);
	}
	
	@Test
	public void highestToLowestTest()
	{
		int[] numbers ={122,67,54,3};
		NumberSorting.bubbleSort(numbers);
		int[] expectedOutput = {3,54,67,122};
		assertArrayEquals(expectedOutput,numbers);
	}
	
	@Test
	public void negativeTest()
	{
		int[] numbers ={0,6,-54,3};
		NumberSorting.bubbleSort(numbers);
		int[] expectedOutput = {-54,0,3,6};
		assertArrayEquals(expectedOutput,numbers);
	}
	
	@Test
	public void sameEntryTest()
	{
		int[] numbers ={3,54,3,54};
		NumberSorting.bubbleSort(numbers);
		int[] expectedOutput = {3,3,54,54};
		assertArrayEquals(expectedOutput,numbers);
	}
}
