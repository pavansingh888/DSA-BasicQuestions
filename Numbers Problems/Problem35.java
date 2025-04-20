public class Problem35 {
    static void Roots(int a,int b, int c){
        if(a==0){
            System.out.println("Invalid");
            return;
        }

        double d=b*b-4*a*c;
        if(d>0){
            System.out.println("Real roots are :");
            System.out.println("x1 : "+(double) (-b+Math.sqrt(d))/(2*a));
            System.out.println("x2 : "+(double) (-b-Math.sqrt(d))/(2*a));
        }else if(d==0){
            System.out.println("Equal roots are :");
            System.out.println("x1 : "+(double) (-b)/(2*a));
            System.out.println("x2 : "+(double) (-b)/(2*a));
        }else {
            System.out.println("Complex roots are :");
            System.out.println("x1 : "+(double) (-b)/(2*a) + " +i"+Math.sqrt(-d)/(2*a));
            System.out.println("x2 : "+(double) (-b)/(2*a) + " -i"+Math.sqrt(-d)/(2*a));
        }
    }

    public static void main(String args[]){
        int a=1,b=1,c=1;
        Roots(a,b,c);
    }
}
