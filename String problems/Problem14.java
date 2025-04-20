/*Maximum occurring character in a string
Maximum occurring character in a string
Problem Statement: Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them. 
Examples:
Example 1:
Input: str = “takeuforward”
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them */
import java.util.Arrays;
public class Problem14 {
    //* Using Frequency Array - O[n] - O[1] */
    // static char maxOccurringChar(String str){
    //     char ans=' ';
    //     int freq[]=new int[200];
    //     int maxfreq=Integer.MIN_VALUE;
    //     for(int i=0;i<str.length();i++){
    //         freq[str.charAt(i)]++;
    //         if(freq[(int) str.charAt(i)]>maxfreq){
    //             maxfreq=freq[(int) str.charAt(i)];
    //             ans=str.charAt(i);
    //         }
    //     }

    //     return ans;
    // }
    //* using sorting to count contigous character - O[nlogn] - O[n] */
    static char maxOccurringChar(String str){
        char charArray[]=str.toCharArray();
        Arrays.sort(charArray);
        str=new String(charArray);
        char ch=str.charAt(0),ans=' ';
        int curr=1, maxCount=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==ch){
                curr++;
            }else{
                if(curr>maxCount){
                    maxCount=curr;
                    ans=ch;
                }
                curr=1;
                ch=str.charAt(i);
            }
        }
        if(curr>maxCount){
            maxCount=curr;
            ans=ch;
        }
        System.out.println(str);//aadefkorrtuwzzz
        return ans;
    }


    public static void main(String[] args) {
        String str = "takeuforwardzzz";
        System.out.println("Maximum occurring character is " + maxOccurringChar(str));
        System.out.println(str);//takeuforward
     }
}
