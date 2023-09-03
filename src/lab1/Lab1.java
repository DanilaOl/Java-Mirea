package lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }

        System.out.println("Sum of array: " + s + ". Mean: " + s/arr.length);

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter number of elements: ");

        size = sc.nextInt();
        int[] arr2 = new int[size];
//        if (sc.hasNextInt()) {
//            size = sc.nextInt();
//            int[] arr2 = new int[size];
//        }
//        else {
//            System.out.println("Error: int is needed");
//            return;
//        }

        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                arr2[i] = sc.nextInt();
            }
        }
    }
}
