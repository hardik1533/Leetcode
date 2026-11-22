class Solution {
    public boolean checkString(String s) {
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a') count++;
        }
        for(char ch : s.toCharArray()){
            if(ch == 'a') count--;
            else break;
        }
        return count == 0 ? true:false;
    }
}