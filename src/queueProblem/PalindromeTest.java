package queueProblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest 
{

	@Test
	public void testNumberPalindrome() throws Exception 
	{
        String str = "1441";
		assertTrue(Palindrome.isPalindrome(str));
    }
	
	@Test
	public void testNumberNotPalindrome() throws Exception 
	{
		String str = "144";
		assertFalse(Palindrome.isPalindrome(str));
    }
	
	@Test(expected=NullPointerException.class)
	public void nullTest()
	{
		String str = null;
		Palindrome.isPalindrome(str);
	}
	
	@Test
	public void testWordPalindrome()
	{
		String str = "racecar";
		assertTrue(Palindrome.isPalindrome(str));
	}
	
	@Test
	public void testWordNotPalindrome()
	{
		String str = "rainbow";
		assertFalse(Palindrome.isPalindrome(str));
	}
	
	@Test
	public void testCapitalNotPalindrome()
	{
		String str = "Eye";
		assertFalse(Palindrome.isPalindrome(str));
	}
	
	@Test
	public void testCapitalPalindrome()
	{
		String str = "EyE";
		assertTrue(Palindrome.isPalindrome(str));
	}

}
