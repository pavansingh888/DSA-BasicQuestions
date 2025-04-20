/*Remove Characters from first String present in the Second String
Problem Statement: Given two strings, write a program to remove characters from the first string which are present in the second string.
Examples:
Example 1:
Input: String str1 = “abcdef”
       String str2 = “cefz”
Output: abd
Explanation: The common characters in both strings are c, e, f.
So after removing these characters from string 1 we get string resulting string as abd. */

import java.util.HashMap;
public class Problem17 {
    //*Using two nested for loop and flag - O[n*m] - O[m-n] */

    // public static String solve(String str1, String str2) {
    //     StringBuffer ans = new StringBuffer();
    //     for (int i = 0; i < str1.length(); i++) {
    //       int flag = 0;
    //       for (int j = 0; j < str2.length(); j++) {
    //         if (str1.charAt(i) == str2.charAt(j)) {
    //           flag = 1;
    //         }
    //       }
    
    //       if (flag != 1)
    //         ans.append(str1.charAt(i));
    //     }
    //     return ans.toString();
    //   }

//*Optimized - Using HashMap O[max(n,m)] - O[max(m,n)] */
public static String solve(String str1, String str2) {
    HashMap <Character,Integer> mp=new HashMap<>();
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<str2.length();i++){
        mp.put(str2.charAt(i),1);
    }

    for(int j=0;j<str1.length();j++){
        if(mp.get(str1.charAt(j))==null){
            sb.append(str1.charAt(j));
        }
    }
    return sb.toString();
}
    public static void main(String args[]) {
        String str1 = "abcdefhfsfs"; // string 1
        String str2 = "cefz"; // string 2
    
        System.out.println("Final string 1:");
        System.out.println(solve(str1, str2));
      }
}
