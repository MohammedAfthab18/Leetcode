class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        int n = nums.length;
        
        // Traverse the array, and whenever a non-zero element is found, move it to the left.
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        
        // Fill the remaining elements with zeroes.
        while (nonZeroIndex < n) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}