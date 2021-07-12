

	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class Maximum_Maximum {
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter test cases ");
			int t=obj.nextInt();
		long answer=0;
			while(t-->0)
			{
				System.out.println("Enter array size");
			    int n=obj.nextInt();
			    long[] arr=new long[n];
			    System.out.println("Enter array element");
			    for(int i=0;i<n;i++)
			    arr[i]=obj.nextInt();
			    Arrays.sort(arr);
			    answer=arr[0]*(n-1);
			    System.out.println(answer);
			}
		}
	}
