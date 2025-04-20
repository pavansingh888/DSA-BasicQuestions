/*Find Non-repeating characters of a String
Problem:  Given a string, print non-repeating characters of the string.
Examples:
Example 1:
Input: string = “google”
Output: l,e
Explanation: Non repeating characters are l,e. */

public class Problem12 {
  //*Naive approach - using 2 loops - O[n^2] - O[n] */
    // static void nonRepeating(String st, int n) {
    //     int freq[] = new int[200];
    //     char s[] = st.toCharArray();

    //     for (int i = 0; i < n; i++) {
    //         freq[i] = 1;
    //         for (int j = i + 1; j < n; j++) {
    //             if (s[i] == s[j]) {
    //                 freq[i]++;

    //                 s[j] = '-'; // set s[j] to 0 to avoid printing visited character
    //             }
    //         }
    //     }

    //     for (int i = 0; i < n; ++i) {
    //         if (freq[i] == 1 && s[i] != ' ' && s[i] != '-') {
    //             System.out.print(s[i] + " ");
    //         }
    //     }
    // }
  //*Linear approach - using frequency[26] - O[n] - O[n] */
  static void nonRepeating(String st, int n) {
    int freq[]=new int[200];
    for(int i=0;i<n;i++){
        freq[(int) st.charAt(i)]++;
    }
    for(int i=0;i<n;i++){
        if(freq[(int) st.charAt(i)]==1 && st.charAt(i) != ' '){
            System.out.print(st.charAt(i)+" ");
        }
        
    }
    
}

    public static void main(String[] args) {
        String st = "blockchain technology";

        int n = st.length();
        System.out.println("Non-repeative character: "); //b k a i t e g y
        nonRepeating(st, n);

    }
}
