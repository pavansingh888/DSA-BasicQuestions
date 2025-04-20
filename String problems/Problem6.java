/*Remove characters from a string except alphabets
Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.
Examples:
Example 1:
Input: string str = "take12% *&u ^$#forward"
Output: takeuforward
Explanation:
Characters 1,2,%,*,&,^,$,# along with whitespaces are 
removed but the order of remaining alphabets is preserved. */
//*StringBuffer vs. StringBuilder:
//StringBuffer: This is a thread-safe version of a string builder. It's designed for use in situations where multiple threads might be accessing or modifying the same instance of the string buffer. It uses synchronization to ensure that only one thread can access the buffer at a time, preventing conflicts and ensuring that the data remains consistent.

//Example: If you have a StringBuffer in a multi-threaded environment (like a web server handling multiple requests), it ensures that changes made by one thread do not interfere with changes made by another thread.

//StringBuilder: This is a non-thread-safe version of a string builder. It's designed for use in single-threaded environments or scenarios where thread safety is not a concern. Because it doesn't use synchronization, it's generally faster and more efficient than StringBuffer in such scenarios.

//Example: If you're working with StringBuilder in a single-threaded application (like a desktop app where only one thread is doing string manipulations), it will perform better because it doesn't have the overhead of synchronization.

//Summary:
//StringBuffer: Thread-safe, slower due to synchronization, used in multi-threaded environments.
//StringBuilder: Not thread-safe, faster, used in single-threaded environments. 
//* O[n] - O[n] */
public class Problem6 {
    static String solve(String str,int n){
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<n;i++){
            int c = str.charAt(i);
            if((c>=65 && c<=90)||(c>=97 && c<=122)){
             ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str="Make12% *&it ^$#success";
        int n = str.length();
        System.out.println(solve(str,n));
    }
}
