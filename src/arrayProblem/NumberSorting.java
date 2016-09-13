package arrayProblem;

public class NumberSorting
{	
	public static void main(String args[])
	{
		int array[] = new int[13];
		
		array[0] = 12;
		array[1] = 0;
		array[2] = 90;
		array[3] = 50;
		array[4] = 4;
		array[5] = 76;
		array[6] = 100;
		array[7] = 30;
		array[8] = 117;
		array[9] = 8;
		array[10] = 34;
		array[11] = 97;
		array[12] = 5;
		
		System.out.println("JAVA ARRAY IMPLEMENTATION\n");
		System.out.println("The numbers to be sorted are :");
		
		result(array);
		array = bubbleSort(array);
		System.out.println("\nThe sorted numbers using Bubble Sort algorithm are :");
		result(array);
	}
	
	public static int[] bubbleSort(int[] array) 
	{
	    int n = array.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++)
	    {
	        for (int j = 1; j < (n - i); j++)
	        {
	            if (array[j - 1] > array[j])
	            {
	                temp = array[j - 1];
	                array[j - 1] = array[j];
	                array[j] = temp;
	            }

	        }
	    }
		return array;
	}
	
	public static void result(int[] array)
	{
		for(int i = 0; i < array.length;i++)
		{
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
}