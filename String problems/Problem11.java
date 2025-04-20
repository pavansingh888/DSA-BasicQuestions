
import java.util.Arrays;
public class Problem11 {
  //* Sort the string and print the consecutive elements count. - O[nlogn] - O[1] */
    // static String sortString(String str){
    //     char c[]=str.toCharArray();
    //     Arrays.sort(c);
    //     return new String(c);
    // }
    // static void Printfrequency(String str){
    //     str=sortString(str);
    //     int count=0;
    //     char ch=str.charAt(0);
    //     for(int i=1;i<str.length();i++){
    //       if(str.charAt(i)==ch){
    //         count++;
    //       }else{
    //         System.out.print(ch);
    //         System.out.print(count);
    //         count=1;
    //         ch=str.charAt(i);
    //       }
    //     }
    //     System.out.print(ch);
    //     System.out.print(count);
    // }

      //* Using frequency[26] - O[n] - O[1] */

      static void Printfrequency(String str){
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
          freq[str.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
          if(freq[i]!=0){
            System.out.print((char) ('a'+i));
            System.out.print(freq[i]);
          }
        }
      }
    public static void main(String args[]) {
        String str = "takeuforward";
        Printfrequency(str);
      }
}
