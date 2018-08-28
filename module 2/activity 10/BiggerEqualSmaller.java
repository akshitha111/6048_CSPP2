import java.util.*;
class BiggerEqualSMaller{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int varA = s.nextInt();
		int varB = s.nextInt();
		if(varA>varB)
			System.out.println("Bigger");
		if(varA<varB)
			System.out.println("Smaller");
		if(varA==varB)
			System.out.println("Equal");
	}
}