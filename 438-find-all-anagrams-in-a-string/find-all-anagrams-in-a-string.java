class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();

        int k=p.length();
        if(k > s.length()){
              return arr;
           }
        for(int i=0;i<k;i++){
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            window.put(ch,window.getOrDefault(ch,0)+1);
        }

        if(map.equals(window)){
            arr.add(0);
        }

        for(int j=k;j<s.length();j++){
            char old=s.charAt(j-k);
            window.put(old,window.get(old)-1);
            if(window.get(old)==0){
                window.remove(old);
            }
            char ch=s.charAt(j);
            window.put(ch,window.getOrDefault(ch,0)+1);

            if(map.equals(window)){
                arr.add(j-k+1);
            }


        }

        return arr;
    }
}