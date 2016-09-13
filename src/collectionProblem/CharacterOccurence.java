package collectionProblem;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class CharacterOccurence
{
	public static Map<String, Integer> countOccurenceOfCharacters(String str)
	{
		if(str.isEmpty()) {
			throw new NullPointerException("Empty String Entered.");
		}
		String[] strArray = str.trim().split("");
		List<String> list = new ArrayList<String>();
		for(int i = 0; i< strArray.length; i++)
		{
			list.add(strArray[i]);
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : list)
		{
			Integer count = map.get(temp);
			map.put(temp, count == null ? 1 : count + 1);
		}
		return map;
	}
	
	public static void main(String args[])
	{
		System.out.println("JAVA COLLECTIONS IMPLEMENTATION");
		System.out.println(" \nEnter a String to know the occurence of characters : ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		Map<String, Integer> map = countOccurenceOfCharacters(inputString.toUpperCase());
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println("Character : " + entry.getKey() + "  Occurence : " + entry.getValue());
		}
	}
}
