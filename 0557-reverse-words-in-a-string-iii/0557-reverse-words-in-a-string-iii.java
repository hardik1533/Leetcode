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
// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder sb = new StringBuilder();
//         int k = 0;
//         for(int i = 0; i < s.length(); i++){
//             if(s.charAt(i) == ' '){
//                 sb.append(new StringBuilder(s.substring(k, i)).reverse());
//                 sb.append(' ');
//                 k = i + 1;
//             } else if(i == s.length() - 1){
//                 sb.append(new StringBuilder(s.substring(k, i + 1)).reverse());
//             }
//         }
//         return sb.toString();
//     }
// }

//Using 2 Pointer: 


class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;

        for (int end = 0; end < n; end++) {
            if (arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        // reverse last word
        reverse(arr, start, n - 1);

        return new String(arr);
    }

    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
