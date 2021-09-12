import java.util.Random;

public class arrayManipulation {
    public static int currentSize = 10;
    public static int[] arr = new int[100];

    public static void randomArr() {
        arr[0] = 0;
        int i = 0;
        Random r = new Random();
        while (i != 10) {
            arr[i] = r.nextInt(100) + 1;
            i++;
        }
    }

    public static void printArray() {
        System.out.print("Index : ");
        for (int i = 1; i <= currentSize; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nArray : ");
        for (int i = 1; i <= currentSize; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
    }

    // Main
    public static void main(String[] args) {
        // Randomly generated Array
        randomArr();
        printArray();
    }
}