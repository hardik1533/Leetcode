class Solution {
    public int maxArea(int[] h) {
        int i = 0, j = h.length - 1, ans = 0;
        while(i < j){
            ans = Math.max(ans, Math.min(h[i], h[j]) * (j - i));
            if(h[i] < h[j]) i++;
            else j--;
        }
        return ans;
    }
}
