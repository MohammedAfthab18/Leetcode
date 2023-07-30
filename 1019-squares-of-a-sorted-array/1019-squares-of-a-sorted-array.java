import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        // Compute the squares of each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Return the sorted squares array
        return nums;
    }
}
