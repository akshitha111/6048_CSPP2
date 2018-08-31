import java.util.Scanner;
/**
* reverse.
*/
public final class Solution {
/**
Do not modify the main function.
*/
    private Solution() {
        /** constructor.
        */
    }
    /** class.
    * @param args String
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /** function.
    * @param a String
    * @return String
    */
    public static String reverseString(final String a) {
        String str = "";
        for (int k = 0; k < a.length(); k += 1) {
            str = a.charAt(k) + str;
        }
        return str;
    }
}
