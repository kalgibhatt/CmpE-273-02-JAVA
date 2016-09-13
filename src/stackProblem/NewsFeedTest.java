package stackProblem;

import static org.junit.Assert.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;

public class NewsFeedTest 
{
	
	@Test
	public void testPushAndPop() 
	{
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		assertEquals("C", s.pop());
		assertEquals("B", s.pop());
		assertEquals("A", s.pop());
	}
	
	@Test
	public void testIsEmpty() 
	{
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		assertEquals("C", s.pop());
		assertEquals("B", s.pop());
		assertEquals("A", s.pop());
		assertTrue(s.isEmpty());
	}
	
	@Test(expected=EmptyStackException.class)
	public void nullTest()
	{
		Stack<String> s = new Stack<String>();
		s.pop();
	}
	
	@Test 
	public void pushTest()
	{
		Stack<String> s = new Stack<String>();
		s.push("A");
		assertEquals(s.peek(),"A");
	}
	 
	
}
