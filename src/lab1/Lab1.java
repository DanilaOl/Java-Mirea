package lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
//        task3();
//        task4();
//        task5(args);
//        task6();
//        System.out.println(task7(20));
    }

    public static void task3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array: " + sum + ". Arithmetical mean: " + (float) sum / arr.length);
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter number of elements: ");

        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        else {
            System.err.println("Error: int is needed");
            return;
        }

        if (size < 1) {
            System.err.println("Error: negative of zero number of elements");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter elements of an array: ");

        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.err.println("Error: int is needed");
                return;
            }
        }

        int max = arr[0], min = arr[0], sum = 0, i = 0;

        while (i < arr.length) {
            sum += arr[i];
            if (arr[i] < min) {min = arr[i];}
            if (arr[i] > max) {max = arr[i];}
            i++;
        }

        System.out.println("Sum of array: " + sum + ". Min element: " + min + ".Max element: " + max);
    }

    public static void task5(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void task6() {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%.4f ", 1./i);
        }
    }

    public static long task7(int num) {
        if (num < 0) {
            System.err.println("Error: no factorial for negative numbers");
            return -1;
        }

        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}
