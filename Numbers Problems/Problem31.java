public class Problem31 {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    static void simple(int num3, int den3) 
    { 
    // Finding gcd of both terms 
    int common_factor = gcd(num3,den3); 

    // Converting both terms into simpler 
    // terms by dividing them by common factor 
    den3 = den3/common_factor; 
    num3 = num3/common_factor;
    System.out.println(num3+"/"+den3);
    } 

    public static void main(String args[]){
        int num1= 3,num2= 1, den1= 4, den2= 7,num3,den3;
        int lcm=den1*den2/gcd(den1,den2);
        num3=num1*(lcm/den1)+num2*(lcm/den2);
        den3=lcm;
         
        //simplifying num3,den3
        simple(num3,den3);
        
    }
}
