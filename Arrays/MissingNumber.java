/*
Problem: Find Missing Number in Array
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MissingNumber {

    public static int findMissing(int[] arr, int n) {

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int missing = findMissing(arr, n);

        System.out.println("Missing number is: " + missing);
    }
}
