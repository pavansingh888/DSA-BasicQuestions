//*If the sum of digits is divides the number then it is called Harshad/Niven number.
//* If the sum of divisors of a number is greater than the number then it is called abundant number. Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number. */

public class Problem26 {
    //*Brute -  O[n] - O[1] */
    // public static void main(String args[]) {
    //     int n = 378;
    //     int temp = n;
    //     int sum = 0;
    //     while (temp != 0) {
    //       sum += temp % 10;
    //       temp /= 10;
    //     }
    //     if (n % sum == 0) {
    //       System.out.println("YES it is Harshad Number");
    //     } else {
    //       System.out.println("NO it is Harshad Number");
    //     }
    
    //   }

      //*using string - O(N) */
      public static void main(String args[]) {
        int num=378;
        String s = Integer.toString(num);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
          sum += s.charAt(i) - '0';//* Subtracting the ASCII value of character 's.charAt(i)'  and '0' --> '1' - '0' --> 49 - 48 = 1 */
        }
        if (num % sum == 0) {
          System.out.print("YES it is a Harshad Number");
        } else {
          System.out.print("NO it is Not a Harshad Number");
        }
      }
}
