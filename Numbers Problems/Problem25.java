public class Problem25 {
    
  static int gcd(int a,int b){
    if(b==0){
      return a;
    }
    return gcd(b,a%b);
}
    public static void main(String args[]){
        int a=12, b=9;
        System.out.print("LCM of a & b : "+a*b/gcd(a,b));
    }
}
