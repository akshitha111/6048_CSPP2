/**
 * author @akshitha.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
/**
* Do not modify this main function.
*/
    protected Solution() { }
/**
* Class for solution.
* @param args String
*/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**

    Need to write the power function and print the output.
    *@param base int
    *@param exponent int
    *@return int
    */
    public static long power(final int base, final int exponent) {
        if (exponent != 0) {
            return (base * power(base, exponent - 1));
        }
        return 1;
    }
}

