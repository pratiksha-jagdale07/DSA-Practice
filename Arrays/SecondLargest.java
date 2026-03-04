/*
Problem: Find Second Largest Element in Array
Difficulty: Easy-Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8};

        int result = findSecondLargest(arr);

        System.out.println("Second Largest Element: " + result);
    }
}
