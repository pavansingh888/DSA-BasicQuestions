/*Change case of each character in a string
Problem Statement: Write a  program to change the case (lower to upper and upper to lower cases) of each character of a given string.
Examples:
Example 1:
Input: String str = “javA”
Output: JAVa
Explanation:
 Changed the lower case characters to uppercase and vice versa. */
 //* O[n] - O[n] */
public class Problem23 {
    public static String solve(String str, int n) {
      StringBuffer ans = new StringBuffer();
      for (int i = 0; i < n; i++) {
        int ascii = (int) str.charAt(i);
  
        if (ascii >= 65 && ascii <= 90)
          ans.append((char)(ascii + 32));
        // ans.append(Character.toLowerCase((char) ascii));
        else if (ascii >= 97 && ascii <= 122)
          ans.append((char)(ascii - 32));
        // ans.append(Character.toUpperCase((char) ascii));
        else if (str.charAt(i) == ' ')
          ans.append(' ');
      }
  
      return ans.toString();
    }
    public static void main(String args[]) {
      String str = "take u forward IS Awesome";
      int length = str.length();
  
      System.out.println("Resultant string: ");
      System.out.println(solve(str, length));
    }
  }
