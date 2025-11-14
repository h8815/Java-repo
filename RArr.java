import java.util.Scanner;

class ArrayReverser {
    private final int[] array;
    private final Scanner scanner;

    public ArrayReverser() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        int num = scanner.nextInt();
        array = new int[num];
    }

    void getArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    void displayReversedArray() {
        System.out.println("\nEntered elements in the array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nReversed Array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class RArr {
    public static void main(String[] args) {
        ArrayReverser arrayReverser = new ArrayReverser();
        arrayReverser.getArray();
        arrayReverser.displayReversedArray();
    }
}