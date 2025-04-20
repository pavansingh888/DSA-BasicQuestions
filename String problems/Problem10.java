/*Capitalize first and last character of each word of a string
Problem Statement: Given a string, write a program to Capitalize the first and last character of each word of that string.
Examples:
Example 1:
Input: String str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: We get the result after capitalizing the first and last character of each word of a string */
//* O[n] - O[n] */
//* Wihtout using toUpperCase() */
public class Problem10 {
       static String Capitalize(String str,int n){
        StringBuffer sb=new StringBuffer(str);
        for(int i=0;i<n;i++){
            if((i==0 || i==n-1) && (int) str.charAt(i)>=97 ){
                sb.setCharAt(i,(char) ( (int) str.charAt(i)-32));
            }else if(str.charAt(i)==' '){
                if((int) str.charAt(i-1) - 32 >= 65 ){
                    sb.setCharAt(i-1,(char) ( (int) str.charAt(i-1)-32));
                }
                if((int) str.charAt(i+1) - 32 >= 65 ){
                    sb.setCharAt(i+1,(char) ( (int) str.charAt(i+1)-32));
                }
            }
        }

        return sb.toString();
       }
    public static void main(String args[]) {
        String str = "take u forward is awesome";
        int size = str.length();
    
        System.out.println("String after capitalizing the first and last letter of each word of the string: ");
        System.out.println(Capitalize(str, size));
      }

      //*Character.toUpperCase(): converts the character argument to uppercase - O[n] - O[n] */
    //   public static String capitalizeFirstAndLast(String str) {
    //     StringBuilder sb = new StringBuilder(str);
    //     int n = sb.length();
        
    //     for (int i = 0; i < n; i++) {
    //         if (i == 0 || (i > 0 && sb.charAt(i - 1) == ' ') || i == n - 1 || (i < n - 1 && sb.charAt(i + 1) == ' ')) {
    //             sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
    //         }
    //     }
        
    //     return sb.toString();
    // }
}
