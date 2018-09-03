/**
 * returns true or false.
 */
import java.util.Scanner;
/**
* imports scanner class.
*/
class InputValidator {
/**
* length is attribute.
*/
private int length;
/**
* data is attribute.
*/
 private String data;
 /**
 * constructor for InputValidator.
 *
 *@param      input is input.
 */
InputValidator(final String input) {
    data = input;
    length = input.length();
 }
 /**
 * function which return true or false.
 *
 *@return     return true or false.
 */
 boolean validateData() {
    final int variable = 6;
    if (length >= variable) {
        return true;
    }
    return false;
    }
 }
 /**
 * class Solution that contains main method.
 */
final class Solution {
    /**
    *constructor for solution.
    */
    private Solution() {
}
/**
* main function.
*
*@param    args  the arguments
*/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}

