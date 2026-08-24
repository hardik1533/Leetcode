class Solution {
    public int lengthOfLongestSubstring(String s) {
    //    Brute :
        // Set<Character> set = new HashSet<>();
        // int n = s.length();
        // int max = 0;
        // if(n == 1) return 1;
        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n; j++){
        //         if(!set.contains(s.charAt(j))){
        //             set.add(s.charAt(j));
        //         }else{
        //             if(set.size() > max) max = set.size();
        //             set.clear();
        //             break;
        //         }
        //     }
        // }
        // return max;

    // Optimal : 
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = ((right - left + 1) > maxLength) ? (right - left + 1) : maxLength;
        }
        return maxLength;
    }
}