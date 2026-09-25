// class Solution {
//     public String reverse(String t){
//         String rev = new StringBuilder(t).reverse().toString();
//         return rev;
//     }

//     public String reverseWords(String s) {
//         StringBuilder sb = new StringBuilder();
//         int k = 0;
//         for(int i  = 0; i < s.length(); i++){
//             if(s.charAt(i) == ' ' ){
//                 sb.append(reverse(s.substring(k,i)));
//                 sb.append(' ');
//                 k = i + 1;
//             }else if(i == s.length() - 1){
//                 sb.append(reverse(s.substring(k,i + 1)));
//                 k = i + 1;
//             }
//         }

//         return sb.toString();
//     }
// }



//Optimal : 
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append(new StringBuilder(s.substring(k, i)).reverse());
                sb.append(' ');
                k = i + 1;
            } else if(i == s.length() - 1){
                sb.append(new StringBuilder(s.substring(k, i + 1)).reverse());
            }
        }
        return sb.toString();
    }
}
