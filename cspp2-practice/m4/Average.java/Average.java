import java.util.*;
public class Average {
	public static void main(String args[]) {
		double sum = 0;
		System.out.println("Enter array size:");
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();		
		double a[] = new double[b];
		System.out.println("Enter array elements:");
		for(int i = 0; i < b; i++)
		{
			a[i] = s.nextDouble();
		}
		for(int i=0;i<b;i++){
			sum = sum+a[i];
		}
		//System.out.println(sum);
		double avg = sum/(a.length);
		System.out.format("%.2f", avg);
	}
}
