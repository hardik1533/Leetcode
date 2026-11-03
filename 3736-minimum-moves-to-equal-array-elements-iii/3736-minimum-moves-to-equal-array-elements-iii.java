class Solution {
    public int minMoves(int[] nums) {
        int larger = 0;
        for(int num : nums){
            if(num > larger) larger = num;
        }

        int moves = 0;
        for(int num : nums){
            moves += (larger - num);
        }

        return moves;
    }
}