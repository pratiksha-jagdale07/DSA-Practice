/*
Problem: Sum of Elements in an Array
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SumArray {

    public static int findSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        int result = findSum(arr);

        System.out.println("Sum of array elements: " + result);
    }
}
