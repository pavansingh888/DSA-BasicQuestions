/*Remove All Duplicates from a String
Problem Statement: Given a String remove all the duplicate characters from the given String.
Examples:
Example 1:
Input: s = "bcabc"
Output: “bca" */

public class Problem15 {
    //*Using 2 for loop - check each previous char than the current character - O[n^2] - O[n] */
//    static String removeDuplicateLetters(String str){
//     StringBuilder sb=new StringBuilder();
    
//     for(int i=0;i<str.length();i++){
//         int j=0;
//         for(j=0;j<i;j++){
//             if(str.charAt(i)==str.charAt(j)){
//               break;
//             }
//         }
//         if(i==j){
//             sb.append(str.charAt(i));
//         }
//     }

//     return sb.toString();
//    }

 //*Using Boolean array of visited ASCII index  - O[n] - O[1] */
 static String removeDuplicateLetters(String str){
     boolean visited[]=new boolean[26];
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<str.length();i++){
        if(visited[str.charAt(i)-'a']==false){
          sb.append(str.charAt(i));
          visited[str.charAt(i)-'a']=true;
        }
     }
     return sb.toString();
 }
    public static void main(String[] args) {
        String str = "cbacdcbc";
        System.out.println("Original String: "+str+"\nAfter removing duplicates: "+removeDuplicateLetters(str));
      }
}
