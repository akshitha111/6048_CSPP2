import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		int m,n,p,q,k,l,i,j;
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		int arr1[][] = new int[m][n];
		for(i=0; i<m;i++){
			for(j=0; j<n;j++){
				arr1[i][j] = s.nextInt();
			}
		}
		p = s.nextInt();
		q = s.nextInt();
		int arr2[][] = new int[p][q];
		int sum[][] = new int[m][q];
		for(k=0;k<p;k++){
			for(l=0;l<q;l++){
				arr2[k][l] = s.nextInt();
			}
		}
		if(m==p && n==q){
			for(i=0;i<m;i++){
				for(l=0;l<q;l++){
					sum[i][l] = arr1[i][l] + arr2[i][l]; 
				}
				for(i=0;i<m;i++){
					for(l=0;l<q-1;l++){
				}
				System.out.print(sum[i][l] + "");
			}
			System.out.println(sum[i][q-1]);
		}
	}
		else
		{
			System.out.println("not possible");
		}
	}
}
