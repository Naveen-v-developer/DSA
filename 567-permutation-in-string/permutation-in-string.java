class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        int k = s1.length();

        for (int i = 0; i < k; i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            char ch = s2.charAt(i);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
        }

        if (map.equals(window)) {
            return true;
        }

        for (int j = k; j < s2.length(); j++) {

            char old = s2.charAt(j - k);

            window.put(old, window.get(old) - 1);

            if (window.get(old) == 0) {
                window.remove(old);
            }

            char ch = s2.charAt(j);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (map.equals(window)) {
                return true;
            }
        }

        return false;
    }
}