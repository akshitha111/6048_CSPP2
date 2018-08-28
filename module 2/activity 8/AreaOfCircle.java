import java.util.*;
public class AreaOfCircle {
	public static void main(String args[]) {
		//double area;
		//double pi;
		//int radius;
		Scanner s = new Scanner(System.in);
		//area = s.nextDouble();
		//pi = s.nextDouble();
		int radius = s.nextInt();
		System.out.println(area(radius));
	}
	public static double area(int radius){
		double area;
		area = pi() * radius *  radius;
		return area;

	}
	public static double pi(){
		double pi = 3.14d;
		return pi;
	}
}