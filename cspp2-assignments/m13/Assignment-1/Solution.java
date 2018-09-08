import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : akshitha
 */
class Set {
    //your code goes here...
    //Good luck :-)
    /**
    * magic number.
    */
    private final int b = 10;
    /**
     * { set }.
     */
    private int[] set;
    /**
     * { size }.
     */
    private int size;
    /**
     * Constructs the object.
     */
    Set() {
        set = new int[b];
        size = 0;
    }
    /**
     * { resize }.
     */
    public void resize() {
       set =  Arrays.copyOf(set, 2 * size);
   }
   /**
    * { function_description }.
    *
    * @return     { description_of_the_return_value }.
    */
    public int size() {
        return size;
    }
    /**
     * { boolean  }.
     *
     * @param      item  int item.
     *
     * @return     { description_of_the_return_value }.
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (set[i] == (item)) {
                return true;
            }
        }  return false;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
            public String toString() {
                if (size == 0) {
                    return "{}";
                }
                String str = "{";
                int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + set[i] + ", ";
        }
        str = str + set[size - 1] + "}";
        return str;
            }
            /**
             * { add }.
             *
             * @param      item  The item
             */


            public void add(final int item) {
                if (!contains(item)) {
            set[size++] = item;
        } else {
            resize();
        }
            }
            /**
             * { add all }.
             *
             * @param      item  The item
             */
            public void add(final int[] item) {
                if (size + item.length > set.length) {
               resize();
               }
            for (int i = 0; i < item.length; i++) {
                if (!contains(item[i])) {
                set[size++] = item[i];

            }
        }
            }
    /*public Set intersection(int t) {
         t = new Set[10];
        return t;
        }
        public Set retainAll(Set s ) {
            return s;
            for(int i=0; i<size;i++) {
                for(int j=0;j<items.length;j++) {
                    if(set[i] == items[j]) {
                        System.out.println(set[i]);
                    }
                }

            }
        }
       public Set cartesianProduct(Set s){
        return s;

    }*/
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                /*case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;*/
                default:
                break;
            }
        }
    }
}


