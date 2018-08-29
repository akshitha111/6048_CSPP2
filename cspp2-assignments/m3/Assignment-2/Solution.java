import java.util.Scanner;
/** Do not modify this main function.
*/
public final class Solution {
    /** This is class.
    */
    private Solution() {
    /** This is constructor.
    */
    }
/**
* Class for solution.
* @param args String
*/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (char c : String.valueOf(i).toCharArray()) {
                if (c == '7') {
                    count++;
                }
            }
        }
    System.out.println(count);
}
}

