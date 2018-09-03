/**
 * StudentDetails.
 */
import java.util.Scanner;
/**
 * imports scanner class.
 */
public final class StudentDetails {
    /**
     * this is a class.
     */
    private StudentDetails() {
    /**
     * this is a constructor.
     */
}
/**
 * { name is a string }.
 */
     private String name;
     /**
      * { rollNumber is int }.
      */
     private int rollNumber;
     /**
      * { marksOne is float }.
      */
     private float marksOne;
     /**
      * { marksTwo is float }.
      */
     private float marksTwo;
     /**
      * { marksThree is float }.
      */
     private float marksThree;
     /**
      * Constructs the object.
      * @param      n     { name }
      * @param      r     { rollNumber }
      * @param      m1    The marksOne
      * @param      m2    The marksTwo
      * @param      m3    The marksThree
      */
    private StudentDetails(final String n, final int r,
        final float m1, final float m2, final float m3) {
        this.name = n;
        this.rollNumber = r;
        this.marksOne = m1;
        this.marksTwo = m2;
        this.marksThree = m3;
    }
    /**
     * { gpa function }.
     *
     * @return     { average is returned}
     */
    double gpa() {
        final int three = 3;
        double avg = (marksOne + marksTwo + marksThree) / three;
        return avg;
    }
    /**main function.
    *@param args String.
    */

public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int rollNumber = sc.nextInt();
        float marksOne = sc.nextFloat();
        float marksTwo = sc.nextFloat();
        float marksThree = sc.nextFloat();
        StudentDetails s1 = new StudentDetails(name, rollNumber,
         marksOne, marksTwo, marksThree);
        System.out.format("%.1f", s1.gpa());
     }
    }
