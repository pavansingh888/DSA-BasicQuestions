/*Find the largest word in a String
Problem: Given a String, find the largest word in the string.
Examples:
Example 1:
Input: string s=”Google Doc”
Output: “Google”
Explanation: Google is the largest word in the given string. */
//* O[n] - O[1] */
public class Problem19 {
    static String maxLength(String str){
        int n=str.length();
        int currLength=0;
        int start=0;
        int maxEnd=0;
        int maxStart=0;
        int j=0;
        int maxLength=0;
        while(j<=n){
            if(j<n && str.charAt(j)!=' '){
                currLength++;
                j++;
            }else{
              if(currLength>maxLength){
                maxLength=currLength;
                currLength=0;
                maxStart=start;
                maxEnd=j;
              }
              j++;
              start=j;
            }
        }
        return str.substring(maxStart,maxEnd);
    }

    public static void main(String[] args) {
        String str = "Google Doctorine ";

        System.out.print("Largest Word is: "+maxLength(str));
       

 }
}
