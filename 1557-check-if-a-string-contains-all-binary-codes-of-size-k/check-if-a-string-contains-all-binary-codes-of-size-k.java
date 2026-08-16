class Solution {
    public boolean hasAllCodes(String s, int k) {
       HashSet<String> set=new HashSet<>();

       int total=1<<k;

       for(int i=0;i<=s.length()-k;i++){

        StringBuilder result=new StringBuilder();

        for(int j=i;j<i+k;j++){
            result.append(s.charAt(j));
        }

        String code = result.toString();
        set.add(code);

       }

       return set.size()==total;
        

    }
} 
