import java.util.Scanner;
public class Concatinate {
	public static void main(String args[]) {
		String s1 = "Hello ";
		Scanner s = new Scanner(System.in);
		String s2 = s.nextLine();
		String s3 = "!";
		String s4 = s1.concat(s2);		
		String s5 = s4.concat(s3);		
		System.out.println(s5);
	}
}