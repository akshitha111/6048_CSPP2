
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1,n2);
        System.out.println(gcd(n1,n2));
    }
    /*
	Need to write the gcd function and print the output.
	*/
    public static int gcd(int n1, int n2) {
        //int n1 = 81, n2 = 153, gcd = 1;
        if(n1==n2) {
            return n1;
        }
        if(n1 == 0 || n2 ==0) {
            return 0;
        }
        if(n1>n2) {
            return gcd(n1-n2,n2); 
            }           
        return gcd(n1,n2-n1);
            
        }

    }

