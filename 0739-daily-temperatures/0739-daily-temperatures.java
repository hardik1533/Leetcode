// class Solution {
//     public int[] dailyTemperatures(int[] t) {
//         int[] ans =  new int[t.length];

//         for(int i = 0; i < t.length; i ++){
//             for(int j = i + 1; j < t.length; j++){
//                 if(t[j] > t[i]){
//                     ans[i] = j - i;
//                     break;
//                 }
//             }
//         }

//         return ans;

//     }
// }

//Optimal : 

class Solution {
    public int[] dailyTemperatures(int[] t) {

        int[] ans = new int[t.length];
        
        Stack<Integer> st = new Stack<>(); 

        for (int i = 0; i < t.length; i++) {
            while (!st.isEmpty() && t[i] > t[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i - idx; // distance to next warmer day
            }
            st.push(i);
        }
        return ans;
    }
}
