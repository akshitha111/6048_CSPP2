import java.util.*;
public class FirstLast6 {
	public static void main(String args[]) {	
	    System.out.println("Enter array size:");	
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();		
		int a[] = new int[b];
		System.out.println("Enter array elements:");
		for(int i = 0; i < b; i++)
		{
			a[i] = s.nextInt();		
		}
		if(a[0]== 6 || a[b-1] == 6) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}
}