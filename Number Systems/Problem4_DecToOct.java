//*Decimal to octal --> similar to decimal to binary */
//*O(log n) - O(1) */
public class Problem4_DecToOct {
    static int DecimaltoOctal(int decimal){
        int rem;
        int pow=0,octal=0;
        while(decimal>0){
            rem=decimal%8;
            octal=octal+rem* (int) Math.pow(10,pow);
            pow++;
            decimal/=8;
        }
        return octal;
    }
    public static void main(String args[]){
        int Decimal = 136;
        System.out.println("The Octal conversion of the given decimal number is :"+DecimaltoOctal(Decimal));
    }
}
