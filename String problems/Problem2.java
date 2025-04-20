/*Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.
Examples:
Example 1:
Input: string str=”Take u forward is Awesome”
Output: 
Vowels: 10
Consonants: 11
White spaces: 4 */
//* O[n] - O[1]*/
public class Problem2 {
    public static void solve(String str, int length) {
        int vowels = 0, consonants = 0, whitespaces = 0;
        str=str.toLowerCase(); //*LEARN 
        for (int i = 0; i < length; i++) {
          char ch = str.charAt(i);
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            vowels++;
          else if (ch >= 'a' && ch <='z') //*LEARN 
            consonants++;
          else if (ch == ' ')
            whitespaces++;
        }
    
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White spaces: " + whitespaces);
      }
      public static void main(String args[]) {
        String str = "Take u forward is Awesome";
        int length = str.length();
        solve(str, length);
      }
}
