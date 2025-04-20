/*Print all Prime Factors of the given number
Problem Statement: Given an integer N, print all of its prime factors.
Examples
Example 1:
Input: N=60
Output: 2, 3, 5
Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.
Example 2:
Input: N=35
Output: 5, 7
Explanation: All factors/divisors of 35 include: 1, 5, 7, 35. Out of these, only 5 and 7 are prime. */
import java.util.List;
import java.util.ArrayList;
public class Problem21 {
    static boolean isPrime(int n){
        boolean prime=true;
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count+=1;
                if((n/i)!=i){
                    count+=1;
                }
            }
        }

        if(count==2){
            return prime;
        }else{
            prime=false;
            return prime;
        }

        
    }
    
    //* Brute force -  O(N*sqrt(N)) - space: Variable */
    // static List<Integer> getPrimeFactors(int n){
    //     List<Integer> primeFactors=new ArrayList<>();

    //     for(int i=2;i<=n;i++){
    //         if(n%i==0){
    //             if(isPrime(i)){
    //                 primeFactors.add(i);
    //             }
    //         }
    //     }

    //     return primeFactors;
    // }
    //* Better -  O(2*N) - space: Variable */
    // static List<Integer> getPrimeFactors(int n){
    //     List<Integer> primeFactors=new ArrayList<>();

    //     for(int i=1;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             if(isPrime(i)){
    //                 primeFactors.add(i);
    //             }

    //             if(n/i!=i){
    //                 if(isPrime(n/i)){
    //                  primeFactors.add(i);
    //                 }
    //             }
                
                
    //         }
    //     }

    //     return primeFactors;
    // }

    //* Optimal - TC can not be exactly predicted - sqrt(n)(for loop) *logn (while loop dividing) - space: Variable */
    static List<Integer> getPrimeFactors(int n){
        List<Integer> primeFactors=new ArrayList<>();

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                primeFactors.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n!=1)
        primeFactors.add(n);
        return primeFactors;
    }

    public static void main(String args[]){
     int n=60; //16
     List<Integer> ans=getPrimeFactors(n);
     System.out.println("Prime factors of "+n+" are: ");
     for (Integer factor : ans) {
        System.out.print(factor+" ");
     }
    }
}
