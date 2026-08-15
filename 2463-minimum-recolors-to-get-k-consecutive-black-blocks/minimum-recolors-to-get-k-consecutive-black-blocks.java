class Solution {
    public int minimumRecolors(String blocks, int k) {

        int count = 0;

        // First window
        for(int i = 0; i < k; i++) {
            if(blocks.charAt(i) == 'W') {
                count++;
            }
        }

        int min = count;

        // Slide the window
        for(int j = k; j < blocks.length(); j++) {

            // Remove left character
            if(blocks.charAt(j - k) == 'W') {
                count--;
            }

            // Add new right character
            if(blocks.charAt(j) == 'W') {
                count++;
            }

            min = Math.min(min, count);
        }

        return min;
    }
}