/*Find word with highest number of repeated letters in string
Problem Statement: Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.
Examples:
Example 1:
Input: string=”abcdefghij google microsoft”
Output: google
Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words */
//*O[n*n] - O[n] */
public class Problem22 {
   static void HighestRepeatedLetters(String str){
    int n=str.length();
    int maximumRepeatedLetterWord=0;
    int curr_maximumRepeatedLetterWord=0;
    StringBuilder result=new StringBuilder();

    for(int left=0;left<n;){
        int right=left+1;
        while(right<n && str.charAt(right)!=' '){
            right++;
        }

        int charCount[]=new int[26];
        for(int index=left;index<right;index++){
            charCount[str.charAt(index)-'a']++;
        }
        curr_maximumRepeatedLetterWord=0;
        for(int j=0;j<26;j++){
            if(charCount[j]>1){
                curr_maximumRepeatedLetterWord++;
            }
        }
        
        if(curr_maximumRepeatedLetterWord>maximumRepeatedLetterWord){
            maximumRepeatedLetterWord=curr_maximumRepeatedLetterWord;
            result.setLength(0);
            for(int i=left;i<right;i++){
                result.append(str.charAt(i));
            }
        }
      
        left=right+1;
    }

    if(result.toString().equals("")){
      System.out.println("-1");
    }else{
        System.out.print("Word with highest number of repeated letters : ") ;
        System.out.println(result)  ;
    }
   }
    public static void main(String[] args) {
        String str="abcdefg google microsoft";
        HighestRepeatedLetters(str);
    }
    
}
