/*Calculate the Power of a Number : Binary Exponentiation
Problem Statement: Given a number N, return all primes till N.
Examples
Example 1:
Input:x = 2, n = 5
Output:32
Explanation: Calculate pow(2, 5) = 25 = 2*2*2*2*2 = 32
Example 2:
Input:x = 21, n = 2
Output: 441
Explanation:  Calculate pow(21, 2) = 212 = 21*21 = 441 */
//*O(log(N)  - O(1) */
public class Problem19 {
    static double myPow(double x, int n){
         if(x==0 || x==1){
            return x;
         }

         double ans=1;

         if(n<0){
            x=1/x;
            n=-(n+1);
            ans=ans*x;
         }

         while(n>0){
            if(n%2==1){
                n=n-1;
                ans=ans*x;
            }else{
                n=n/2;
                x=x*x;
            }
         }

         return ans;
    }
    public static void main(String args[]){
        double x = 2;
        int n = 21;
        System.out.println("Base: " + x);
        System.out.println("Power: " + n);

        double result = myPow(x, n);
        System.out.println("Result: " + result);
    }
}
