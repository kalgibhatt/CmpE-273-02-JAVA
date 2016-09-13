package stackProblem;
import java.io.IOException;
import java.util.Stack;

public class NewsFeed
{
	Stack<String> stk = new Stack<>();
	public void addNewsFeed(String newsFeed)
	{
		stk.push(newsFeed);
	}
	
	public Stack<String> showNewsFeed(NewsFeed newsFeed) throws IOException
	{
		System.out.println("JAVA STACK IMPLEMENTATION\n");
		System.out.println("Press enter to get next news..!!");
		while(!stk.isEmpty())
		{
			System.out.println(stk.pop());
			System.in.read();
		}
		System.out.println("You are all caught up !!!!!");
		return stk;
	}
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		NewsFeed newsFeed = new NewsFeed();
		newsFeed.addNewsFeed("The current temperature is 86" + Character.toString((char)0x00b0) + "F");
		newsFeed.addNewsFeed("New iPhone may be unveiled Wednesday.");
		newsFeed.addNewsFeed("88 former military leaders write letter backing Trump.");
		newsFeed.addNewsFeed("Air pollution particles found inside human brains.");
		newsFeed.addNewsFeed("Van Susteren eaving Fox News.");
		
		newsFeed.showNewsFeed(newsFeed);
	}
}

	