class Solution {
    public int divisorSubstrings(int num, int k) {

        String s=String.valueOf(num);
        int val=0;
        int count=0;
        for(int i=0;i<k;i++){
            val=val*10+(s.charAt(i)-'0');
        }
        if(val!=0 && num%val==0){
            count++;
        }
        int  pow=(int)Math.pow(10,k-1);
        for(int i=k;i<s.length();i++){
            int newdigit=(s.charAt(i)-'0');
            val=(val%pow)*10+newdigit;
            if(val!=0 && num%val==0){
                count++;
            }
        }

        return count;
    }
}