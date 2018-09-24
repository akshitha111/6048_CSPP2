import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
/**
 * Class for solution.
 */
class Solution {
    /**
     * constructor fro solution class.
     */
    protected Solution() {

    }
    /**
     * main method for solution class.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        try {
        Document d = new Document();
        String path;
        Scanner scan = new Scanner(System.in);
        path = scan.nextLine();
        File folder = new File(path);
        File[] list = folder.listFiles();
        int length = list.length;
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = Document.compare(
                Document.DocumentToString(list[i]),
                 Document.DocumentToString(list[j]));
            }
        }
        System.out.print("      \t");
        for (int i = 0; i < list.length - 1; i++) {
            System.out.print("\t" + list[i].getName());
        }
        System.out.println("\t" + list[length - 1].getName());
        for (int i = 0; i < length; i++) {
            System.out.print(list[i].getName() + "\t");
            for (int j = 0; j < length; j++) {
    System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
    } catch (NoSuchElementException e) {
        System.out.println("empty directory");
    }
    }
}
