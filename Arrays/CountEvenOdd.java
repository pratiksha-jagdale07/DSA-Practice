/*
Problem: Count Even and Odd Numbers in Array
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CountEvenOdd {

    public static void countNumbers(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        countNumbers(arr);
    }
}
