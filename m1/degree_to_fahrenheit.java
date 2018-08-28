import java.util.*;
class DegreeToFahrenheit {
	public static void main(String args[]) {
		float degree;
		//float fahrenheit = ((9/5));
		//fahrenheit = fahrenheit * degree;


		Scanner s = new Scanner(System.in);
		degree = s.nextFloat();
		//float degree;
		float fahrenheit = 1.8f;
		float a = 32f;
		fahrenheit = fahrenheit * degree;
		fahrenheit = fahrenheit + a;

		//int fahrenheit = (degree*(9/5));
		//fahrenheit = fahrenheit
		System.out.format("%.2f",fahrenheit);


	}
}