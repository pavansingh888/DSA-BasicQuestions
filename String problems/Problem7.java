
import java.util.Stack;
public class Problem7 {
    

    //*Using stacks O[n] - O[n] due to external stack*/
    // public static void main(String[] args) {
    //     String str1="Using stack";
    //     Stack<Character> stack=new Stack<>(); //*LEARN */
    //     char reverseString[]=new char[str1.length()];

    //     for(int i=0;i<str1.length();i++){
    //         stack.push(str1.charAt(i));//*LEARN */

    //     }

    //     int count=0;
    //     while(!stack.isEmpty()){
    //         reverseString[count++]=stack.pop();//*LEARN */
    //     }

    //     str1=new String(reverseString);
    //     System.out.println(str1);   
    // }

    //* Using tw0 pointer O[n] - O[1]*/
    // static String swap(String s,int i,int j){
    //     StringBuilder str=new StringBuilder(s);
    //     str.setCharAt(i,s.charAt(j)); //*LEARN */
    //     str.setCharAt(j,s.charAt(i));
    //     return str.toString();
    // }
    // public static void main(String[] args) {
    //     String str2="Using two pointer";
    //     int i=0,j=str2.length()-1;
        
    //     while(i<j){
    //         str2=swap(str2,i,j);
    //         i++;
    //         j--;
    //     }
    //     System.out.println(str2);
    // }

    //* Using library functions O[n] - O[1]*/
    public static void main(String[] args)
    {
        String str = "library functions";
 
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse(); //*LEARN  -  We can not provide argument in reverse - we can do reverse a range by help of - sb.replace(start, end, subStr.toString()); */
        
         str=str1.toString();
 
        // print reversed String
        System.out.println(str);
    }
}
