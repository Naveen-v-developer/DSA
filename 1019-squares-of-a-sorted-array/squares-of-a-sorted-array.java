class Solution {
    public int[] sortedSquares(int[] nums) {

        int k=0;
        for(int i=0;i<nums.length;i++){
            nums[k]=(int)Math.pow(nums[i],2);
            k++;
        }
        Arrays.sort(nums);

        return nums;
        
    }
}