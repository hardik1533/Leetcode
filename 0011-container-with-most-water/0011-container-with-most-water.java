class Solution {
    public int maxArea(int[] h) {
        int i = 0, j = h.length - 1;
        int maxLeft = 0, maxRight = 0;
        int ans = 0;
        while(i < j){
            int maxW = (Math.min(h[i],h[j]) * (j - i));
            if(ans < maxW) ans = maxW;
            if(h[i] < h[j]) i++;
            else j--;
        }
        return ans;
    }
}