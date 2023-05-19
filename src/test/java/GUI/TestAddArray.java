package GUI;

import java.util.Arrays;
import java.util.Scanner;

public class TestAddArray {
    // Main method
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] A = {1, 2, 3, 4};
        
        // Create a new array called 'newArr' and copy the contents of 'A' to it
        int[] newArr = Arrays.copyOf(A, A.length);
    
        // Prompt the user to enter a number until the user enters 0
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số (0 để kết thúc): ");
            n = scanner.nextInt();
    
            // If the entered number is 0, break out of the loop
            if (n == 0) {
                break;
            }
    
            boolean isExist = false;
    
            // Check if the entered number already exists in the 'newArr' array
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i] == n) {
                    // If it does, increment the value at that index by 1
                    newArr[i]++;
                    isExist = true;
                    break;
                }
            }
    
            // If the entered number doesn't exist in the array, add it to the end of the array
            if (!isExist) {
                newArr = Arrays.copyOf(newArr, newArr.length + 1);
                newArr[newArr.length - 1] = n;
            }
        } while (true);
    
        // Print out the final processed array
        System.out.println("Mảng sau khi xử lý: " + Arrays.toString(newArr));
    }
    
}
