//*Check if a prime number can be expressed as sum of two Prime Numbers */ 
/*
     * even + even = even
     * odd + odd = even
     * odd + even = odd
     * So, a prime number(i.e odd) to be represented as sum of 2 prime number, 1 number out of the 2 number has to be even - And only even prime no. is 2.
     * So we will check, if given number is prime and then will check if number-2 is also prime => number can be represented as sum of 2 primes.
     */
public class Problem33 {
   
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
     
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
     
        return true;
    }
     
    static boolean isPossible(int N)
    {

        if (isPrime(N) && isPrime(N - 2))
            return true;
        else
            return false;
    }
    
     public static void main(String []args){
          
        int n = 13;
     
        if (isPossible(n) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
     }
}
