class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer>  map=new HashMap<>();
        int maxcount=0;
        int answer=0;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int count=map.get(nums[i]);

            if(count>maxcount){
                maxcount=count;
                answer=nums[i];
            }
        }

        return answer;
        
    }
}