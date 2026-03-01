/*
Problem: Find Maximum Element in Array
Platform: Practice
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FindMax {

    public static int findMaximum(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        System.out.println("Maximum element is: " + findMaximum(arr));
    }
}
