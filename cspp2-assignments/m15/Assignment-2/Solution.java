import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 *  sorted set class.
 */
class SortedSet extends Set {
    /**
     * sort function.
     *
     * @param      array  int array
     */
    public void sort(final int[] array) {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    /**
     * add the item function.
     *
     * @param      item  int item
     */
    public void add(final int item) {
        if (!contains(item)) {
            set[size++] = item;
        }
        sort(set);
    }
    /**
     * returns subset.
     *
     * @param      start  int start
     * @param      end    int end
     *
     * @return     from start to end returns elements.
     * @throws  Exception if a problem occurs.
     */
    public int[] subSet(final int start, final int end) throws Exception {
        if (start > end) {
            throw new Exception("Invalid Arguments to Subset Exception");
        }
        int[] result = new int[size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] >= start) {
                for (int j = i; j < size; j++) {
                    if (set[j] < end) {
                        result[k++] = set[i];
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(result, k);
    }
    /**
     * The headset function.
     *
     * @param      end   int end
     *
     * @return     returms elements.
     * @throws  Exception if a problem occurs.
     *
     */
    public int[] headSet(final int end) throws Exception {
        int[] result = new int[size];
        int temp = 0;

        for (int i = 0; i < size; i++) {
            if (set[i] < end) {
                result[i] = set[i];
                temp++;
            }
        }
        if (temp == 0) {
            throw new Exception("Set Empty Exception");
        } else {
            return Arrays.copyOf(result, temp);
        }
    }
    /**
     * The last function.
     *
     * @return     returns list of elements.
     * @throws  Exception if a problem occurs.
     *
     */
    public int last() throws Exception {
        if (size == 0) {
                throw new Exception("Set Empty Exception");
        }
        return set[size - 1];
}
    /**
     * Adds all.
     *
     * @param      element  int[] element
     */
    public void addAll(final int[] element) {
        for (int i : element) {
            this.add(i);
        }
    }
}
/**
 * This is a Solution class.
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
        SortedSet s = new SortedSet();
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
            case "intersection":
                s = new SortedSet();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
            case "retainAll":
                s = new SortedSet();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
            case "cartesianProduct":
                s = new SortedSet();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
            case "subSet":
            try {
                if (tokens.length != 2) {
                    break;
                }
                String[] arrstring3 = tokens[1].split(",");
                int[] object = s.subSet(Integer.parseInt(arrstring3[0]),
                                        Integer.parseInt(arrstring3[1]));
                if (object != null) {
                    System.out.println(Arrays.toString(object).replace("[",
                        "{").replace("]", "}"));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;

            case "headSet":
            try {
                if (tokens.length != 2) {
                    break;
                }
                int[] obj = s.headSet(Integer.parseInt(tokens[1]));
                if (obj != null) {
                    System.out.println(Arrays.toString(obj).replace("[",
                        "{").replace("]", "}"));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
            case "last":
            try {
                if (tokens.length != 1) {
                    break;
                }
                int temp = s.last();
                System.out.println(temp);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
            case "addAll":
                int[] intArr = intArray(tokens[1]);
                if (intArr.length == 1) {
                    s.add(intArr[0]);
                } else {
                    s.add(intArr);
                }
                break;
            default:
                break;
            }
        }
    }
}





