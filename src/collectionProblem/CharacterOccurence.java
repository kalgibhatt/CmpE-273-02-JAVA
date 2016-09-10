package collectionProblem;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class CharacterOccurence
{
	public static void CollectionProblem(String str)
	{
		String string = str;
		String[] strArray = string.split("");
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
		print(map);
	}
	
	private static void print(Map<String , Integer> map)
	{
		for(Map.Entry<String , Integer> entry : map.entrySet())
		{
			System.out.println("Character : " + entry.getKey() + "  " + "Occurence : " + entry.getValue());
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("JAVA COLLECTIONS IMPLEMENTATION");
		System.out.println(" \nEnter a String to know the occurence of characters : ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		CollectionProblem(inputString.toLowerCase());
	}
}
