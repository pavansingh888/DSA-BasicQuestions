// Convert Binary to Octal
// Problem Statement: Convert a binary number to an octal number
// Examples:
// Example 1:.
// Input: N = 1100110
// Output: 146
// Explanation: 1100110 when converted to octal number is “146”.

// Example 2:
// Input: 11111
// Output: 37
// Explanation: 11111 when converted to octal number is “37”.


/*
 * LEARN :
 * The binary number is 1011101.
 * Add leading zeros to the leftmost group to make it three digits: 001 011 101.
 * 4,2,1 --> 1st*4 , 2nd*2, 3rd*1
001 in binary = 1 in octal.
011 in binary = 3 in octal.
101 in binary = 5 in octal.
The octal number is 135.
 */

//* O(n) - O(1) */
public class Problem2_BinToOctal {
    public static void main(String args[]){
        String s="1100110";
    int n=s.length();
    if(n%3==1){
        s="00"+s;
    }else if(n%3==2){
        s="0"+s;
    }

    n=s.length();
    String ans="";
    for(int i=0;i<n;i=i+3){
        //*learn
        int temp=(s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0')*1;
        ans= ans+Integer.toString(temp);
    }

    System.out.println(ans);
    }
}
