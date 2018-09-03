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
        String givenString = sc.nextLine();
        String reverse = reverseString(givenString);
        System.out.println(reverse);
    }
    /** function.
    * @param a String a is user input
    * @return String  returns reversed string
    */
    public static String reverseString(final String a) {
        String str = "";
        for (int k = 0; k < a.length(); k += 1) {
            str = a.charAt(k) + str;
        }
        return str;
    }
}
