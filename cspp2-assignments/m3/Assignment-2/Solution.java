
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        //System.out.println(numberOf7sinRange);
    }  
}
public class TotalNoOfSeven {
	int i , n;
	int count = 0;
	for(int i = 1 ; i <= n; i++) {
		for(n=1 ; n!=0 ; n = n/10){
			if(n%7==0){
				System.out.println(i);
			}
		}
	}
}        
       
        
    
