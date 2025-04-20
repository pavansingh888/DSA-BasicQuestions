/*Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a)
Examples:
Example 1:
Input: string str = “abcdxyz”
Output: bcdeyza */
//* O[n] - O[n] */
public class Problem18 {
    public static String solve(String str, int length) {
      StringBuffer sb=new StringBuffer();
      for(int i=0;i<length;i++){
        int ascii=(int) str.charAt(i);
        if(ascii==90){
            sb.insert(i,(char) 65);
        }else if(ascii==122){
            sb.insert(i,(char) 97);
        }else if((ascii>=65 && ascii<90) || (ascii>=97 && ascii<122)){
            sb.insert(i,(char)++ascii);
        }
      }
      return sb.toString();
    }
    public static void main(String args[]) {
        String str = "abcdxyz";
        int length = str.length();
        System.out.println("Original string: ");
        System.out.println(str);
        System.out.println("New string: ");
        System.out.println(solve(str, length));
      }
}
