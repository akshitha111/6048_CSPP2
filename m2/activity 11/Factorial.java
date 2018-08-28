import java.util.*;
class Factorial{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(fact(num));
	}
		public static int fact(int num){
			if (num==1 || num==0)
				return 1;
			else
				return num*fact(num-1);
		}
	}
