/*Print Fibonacci Series up to Nth term
Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.
Examples:
Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)
Example 2:
Input: 6
Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing) */

public class Problem17 {
    public static void main(String args[]){
        //*AP - 1 Naive - O(n)+O(n) - O(n)*/
        // int n=8;
        // if(n==0) {
        //     System.out.println(0);
        // }
        // else{
        //     int fib[]=new int[n+1]; //n+1 for zero based indexing for fib series
        //     fib[0]=0;
        //     fib[1]=1;
        //     for(int i=2;i<=n;i++){
        //         fib[i]=fib[i-1]+fib[i-2];
        //     }
        //     for(int i=0;i<=n;i++){
        //         System.out.print(fib[i]+" ");
        //     }
        // }

        //*AP - 2 - Space optimised -  O(N) - O(1)*/
        // int n=8;
        // if(n==0) {
        //     System.out.println(0);
        // }
        // else{
        //     int curr;
        //     int secondLast=0;
        //     int last=1;
        //     System.out.print(secondLast+" "+last+" ");
        //     for(int i=2;i<=n;i++){
        //         curr=last+secondLast;
        //         secondLast=last;
        //         last=curr;
        //         System.out.print(curr+" ");
        //     }
        // }

        //*print the Nth Fibonacci number using functional recursion with multiple function calls */
        //This problem involves two function calls for each iteration which further expands to 4 function calls and so on which makes worst-case time complexity to be exponential in nature
        //O(N) At maximum there could be N function calls waiting in the recursion stack since we need to calculate the Nth Fibonacci number for which we also need to calculate (N-1) Fibonacci numbers before it

        int N = 4;
       System.out.println(fibonacci(N));
    }

    static int fibonacci(int n){
        if(n<=1)
        return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
