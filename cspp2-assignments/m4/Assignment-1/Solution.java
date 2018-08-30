
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		System.out.println("Enter array size:");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();		
		}
		int max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println(max);
	}
}