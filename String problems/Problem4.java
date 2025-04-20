/*Remove all vowels from the String
Problem Statement: Given a String, write a program to remove vowels from a given String.
Examples:
Example 1:
Input: Str = “take u forward”
Output: tk  frwrd
Explanation: All vowels are removed from the given String.
Example 2:
Input: Str = “I am very happy today”
Output:  m vry happy tdy
Explanation: All vowels are removed from the given String. */
//*O[n^2] - since substring takes O[n] to copy. - O[n] - for space required to copy for new substring */
public class Problem4 {
    static String removeVowels(String str){
       str=str.toLowerCase();
       for(int i=0;i<str.length();i++){
        Character c=str.charAt(i);
        if(c=='a'||c=='i'||c=='o'||c=='e'||c=='u'){
            str=str.substring(0,i)+str.substring(i+1); //*LEARN 
            i--; //*LEARN
        }
       }
        return str;
    }

    public static void main(String[] args) {
        String str="take wood u forward";
        System.out.println(removeVowels(str));
    }
}
