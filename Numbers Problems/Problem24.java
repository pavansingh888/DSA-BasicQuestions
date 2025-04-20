public class Problem24 {
    //*Brute force O(n) */
    // static int gcd(int a,int b){
    //     int gcd=1;
    //   for(int i=1;i<Math.min(a,b);i++){
    //     if(a%i==0 && b%i==0){
    //         gcd=i;
    //     }
    //   }
    //   return gcd;
    // }

    //*Better O(n) */
    // static int gcd(int a,int b){
    //     int gcd=1;
    //   for(int i=Math.min(a,b);i>=1;i--){
    //     if(a%i==0 && b%i==0){
    //         gcd=i;
    //         return gcd;
    //     }
    //   }
    //   return gcd;
    // }

   //*Optimal - Using Euclidean Algorithm -  GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.*/ 
   //* O(logɸmin(a,b)) - base is variable since a%b or b%a based on conditions but not a constant divisor */ 
   static int gcd(int a,int b){
    while(a>0 && b>0){
        if(a>b){
          a=a%b;  
        } else{
          b=b%a;  
        }
    }
    if(a==0) return b;
    return a;
}
    public static void main(String args[]){
        int a=12, b=9;
        System.out.println("GCD of a & b : "+gcd(a,b));
        System.out.print("LCM of a & b : "+a*b/gcd(a,b));
    }
}
