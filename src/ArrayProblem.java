public class ArrayProblem
{
	public static int array[];
	
	public static void main(String args[])
	{
		array = new int[13];
		
		array[0] = 12;
		array[1] = 1;
		array[2] = 45;
		array[3] = 56;
		array[4] = 6;
		array[5] = 123;
		array[6] = 23;
		array[7] = 0;
		array[8] = 17;
		array[9] = 98;
		array[10] = 100;
		array[11] = 78;
		array[12] = 65;
		
		System.out.println("JAVA ARRAY IMPLEMENTATION\n");
		System.out.println("The numbers to be sorted are :");
		
		result();
		bubblesort();
		System.out.println("\nThe sorted numbers using Bubble Sort algorithm are :");
		result();
	}
	
	public static void bubblesort()
	{
		int min = 0,max = array.length - 1;
		
		for(int i = max;i > 1 ; i--)
		{
			for(int j = min;j < i; j++)
			{
				if(array[j] > array[j+1])
				{
					swap(j,j+1);
				}
			}
		}
		
	}
	
	public static void swap(int min,int max)
	{
		int temp = array[min];
		array[min] = array[max];
		array[max] = temp;
	}
	
	public static void result()
	{
		for(int i = 0; i < array.length;i++)
		{
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
}