import java.util.Scanner;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			String s=sc.next();
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	public static String binaryToDecimal(String s) {
		int decimal = 0;
		int i =0;
		long n = Long.parseLong(s);
	    while(n!=0) {
	    		decimal += ((n%10)*Math.pow(2,i));
	    		n = n/10;
	    		i++;
	    		}
	    		String str1 = decimal + "";
	    		return str1;
		}	

}
