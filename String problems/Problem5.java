/*Remove Spaces from a String
Problem Statement: Given a string, write a program to remove all the whitespaces from the string.
Examples:
Example 1:
Input: str = “Take you forward” 
Output: Takeyouforward
Explanation: After removing all the whitespaces Takeyouforward is the result */
//*O[n]  */
public class Problem5 {
    static int removeSapces(char str[]){
        int count=0;
        for(int i=0;i<str.length;i++){
            if(str[i]!=' '){
                str[count]=str[i];
                count++;
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        char str[]="Take u forward ".toCharArray(); //*LEARN 
        int count=removeSapces(str);
        System.out.println(String.valueOf(str).subSequence(0,count));
        //*LEARN
        //subSequence(0, count): Returns a CharSequence object, which is a more general interface that can be implemented by various classes, including String.
        //subSequence(0, count): While it returns a CharSequence, if you need to use String-specific methods afterward, you might need to cast it to String or convert it using toString().
    }
}
