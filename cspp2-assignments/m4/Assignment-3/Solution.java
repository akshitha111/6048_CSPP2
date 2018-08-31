/**
* binary.
*/
import java.util.Scanner;
/**
* import.
*/
public final class Solution {
/**
*Do not modify this main function.
*/
public static final int N_U = 10;
/**
 * Constructs the object.
 */
    private Solution() {
        /**
         * constructor.
         */
    }
/**
 * { function_description }
 * main function.
 * @param      args  The arguments
 */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    /** .
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */

    public static String binaryToDecimal(final String s) {
        int decimal = 0;
        int i = 0;
        long n = Long.parseLong(s);
        while (n != 0) {
                decimal += ((n % N_U) * Math.pow(2, i));
                n = n / N_U;
                i++;
                }
                String str1 = decimal + "";
                return str1;
        }

}
