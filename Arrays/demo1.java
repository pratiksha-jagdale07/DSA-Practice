// Find Maximum Element in Array
// Difficulty: Very Easy

public class demo1 {
    public int findMax(int[] nums) {
        int max = nums[0]; // assume first element is max

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // update max if bigger found
            }
        }
        return max;
    }

    // Test it
    public static void main(String[] args) {
        demo1 solution = new demo1();
        int[] arr = {3, 7, 1, 9, 4};
        System.out.println("Maximum: " + solution.findMax(arr));
        // Output: Maximum: 9
    }
}