//ArrayConversion.java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Taking user input for array elements
        String[] array = new String[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        // Convert Array to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Converted ArrayList: " + arrayList);

        // Convert ArrayList back to Array
        String[] newArray = arrayList.toArray(new String[0]);
        System.out.println("Converted Array: " + Arrays.toString(newArray));

        scanner.close();
    }
}
