using System;
namespace Main
{
	public class Program
	{
		public static void Main(string[] args)
		{
			int[] arr = {34,2,100,5,9,7};
			BubbleSort.Sort(arr);
			print(arr);
			 
			
		}
		public static void print(int[] arr)
		{
		  for (int k = 0; k<arr.Length; k++)
		  {
		    Console.Write(arr[k]+" ");
		  }
		}
	}
	
	public class BubbleSort
	{
	  public static void Sort(int[] arr)
	  {
	    int n = arr.Length;
	    for (int i=0; i < n-1; i++)
	    {
	    for (int j = 0; j<n-i-1 ; j++)
	    {
	      if (arr[j] > arr[j+1])
	      {
	        int swap = arr[j];
	        arr[j] = arr[j+1];
	        arr[j+1] = swap;
	        
	      }
	    }
	    }
	  }
	}
}
