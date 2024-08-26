public class Problem1_BinToDec {
    public static void main(String[] args) {
        //*Using inbuilt function - O(n) */
        // String s = "1011";
        // int result = Integer.parseInt(s, 2);
        //first argument is string that we want to convert to decimal(parseInt always converts to decimal)
        //second argument is to tell current string is in binary format. we can also mention 8(octal),10(decimal),16(hexadecimal).
        // System.out.println(result);

        //*Using string functions - O(n) */
        String s = "1011";
        int n = s.length();
        int base = 1;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
          if (s.charAt(i) == '1') {
            ans += base;
          }
          base *= 2;
        }
        System.out.print(ans);
    }
}