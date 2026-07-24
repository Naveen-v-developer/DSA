class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;                    // Increase current streak
                max = Math.max(max, count); // Update maximum streak
            } else {
                count = 0;                  // Reset streak on 0
            }
        }

        return max;
    }
}