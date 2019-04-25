import java.util.Scanner;

public final class Solution {

   

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] arr = new int[a];
    for (int i = 0; i < a; i++) {
        arr[i] = sc.nextInt();
    }
    int max = arr[0];
    for (int j = 0; j < arr.length; j++) {
        if(max < arr[j])
            max = arr[j];
    }
    System.out.println(max);
}
}