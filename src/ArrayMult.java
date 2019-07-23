import java.util.Scanner;

public class ArrayMult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array's length: ");
        int n = scanner.nextInt();
        int myArray[] = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter the " + i + "-th elementh of array: ");
            myArray[i] = input.nextInt();
        }
        System.out.println("Elements are multiples of '3' are: ");
        for (int i : myArray) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}
