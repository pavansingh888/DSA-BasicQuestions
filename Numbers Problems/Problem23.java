/*
*Automorphic - last digits of square is same as the original number
*Strong number/ Krishnamurthi number/Peterson Number - sum of factorial of individual digits of a number is equal to the original number then the number is called a strong number.
*/

/*Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
Examples:
Example 1:
Input Format: N = 76
Result: Automorphic Number
Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.
Input Format: 25
Result: Automorphic Number
Explanation: Calculating 25 * 25 gives 625, it ends with the given number. */

public class Problem23 {

    public static boolean isAutomorphic(int N) {
      int sq=N*N;

      while(N>0){
        if(N%10 != sq%10)
        return false;

        N=N/10;
        sq=sq/10;
      }

      return true;
    }
    public static void main(String args[]) {
      int n = 25;
      if(isAutomorphic(n)==true)
      System.out.println("Automorphic Number");
      else
      System.out.println("Not Automorphic Number");
    }
  }   