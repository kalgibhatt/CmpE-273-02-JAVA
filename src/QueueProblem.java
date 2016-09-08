import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class QueueProblem 
{
	private static Scanner input;
	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		String inputString;
		
		System.out.println("JAVA QUEUE IMPLEMENTATION\n");
		while(true)
		{
			System.out.print("Enter a string or exter exit : ");
			inputString = input.next();
			
			if(!inputString.equals("exit"))
			{
				if (isPalindrome(inputString))
				{
					System.out.println(inputString + " is a palindrome.");
				}
				else
				{
					System.out.println(inputString + " is not a palindrome.");
				}
			} 
			else 
			{
				break;
			}
		}
	}

	public static boolean isPalindrome(String input) 
	{
		Queue<Character> q = new LinkedList<Character>();
		Stack<Character> s = new Stack<Character>();
		char letter;
		int i;

		for (i = 0; i < input.length(); i++)
		{
			letter = input.charAt(i);
			q.add(letter);
			s.push(letter);
		}
		while (!q.isEmpty()) 
		{
			if (q.remove() != s.pop())
				return false;
		}
		return true;
	}
}