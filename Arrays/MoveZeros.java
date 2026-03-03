/*
Problem: Move All Zeros to End

Difficulty: Easy-Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MoveZeros {

    public static void moveZerosToEnd(int[] arr) {
        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZerosToEnd(arr);

        System.out.print("After moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
