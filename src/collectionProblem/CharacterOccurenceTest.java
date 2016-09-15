package collectionProblem;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class CharacterOccurenceTest
{
	@Test
	public void normalTest()
	{	
		String string = "Hello World";
		Map<String, Integer> map = CharacterOccurence.countOccurenceOfCharacters(string.toLowerCase());
		assertEquals(1,map.get("h"),0);
		assertEquals(1,map.get("e"),0);
		assertEquals(3,map.get("l"),0);
		assertEquals(2,map.get("o"),0);
		assertEquals(1,map.get("w"),0);
		assertEquals(1,map.get("r"),0);
		assertEquals(1,map.get("d"),0);
		assertEquals(1,map.get("h"),0);
		assertEquals(1,map.get(" "),0);
	}
	
	@Test(expected=NullPointerException.class)
	public void nullTest()
	{	
		String string = "";
		Map<String, Integer> map = CharacterOccurence.countOccurenceOfCharacters(string.toLowerCase());
	}
	
	@Test
	public void extraSpaceTest()
	{	
		String string = "         Hello World";
		Map<String, Integer> map = CharacterOccurence.countOccurenceOfCharacters(string.toLowerCase());
		assertEquals(1,map.get("h"),0);
		assertEquals(1,map.get("e"),0);
		assertEquals(3,map.get("l"),0);
		assertEquals(2,map.get("o"),0);
		assertEquals(1,map.get("w"),0);
		assertEquals(1,map.get("r"),0);
		assertEquals(1,map.get("d"),0);
		assertEquals(1,map.get("h"),0);
		assertEquals(1,map.get(" "),0);
	}

}
