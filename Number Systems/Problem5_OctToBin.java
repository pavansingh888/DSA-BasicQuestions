//*To convert octal to binary, first convert octal --> Decimal then Decimal --> Binary */
//* O(log n) - O(0) */
public class Problem5_OctToBin{
    static int octalToDecimal(int octal){
        int pow=0;
        int rem;
        int decimal =0;
        while(octal>0){
            rem = octal%10;
            decimal=decimal+rem* (int) Math.pow(8,pow);
            pow++;
            octal=octal/10;
        }
        return decimal;
    }
    static int decimalToBinary(int decimal){
       int binary = 0;
       int pow=0;
       int rem;
        while(decimal>0){
            rem=decimal%2;
            binary=binary+rem* (int) Math.pow(10,pow);
            pow++;
            decimal/=2;
        }
        return binary;
    }
    public static void main(String args[]){
     int octal=345;
     int decimal=octalToDecimal(octal);
     System.out.println("Octal converted to Binary is :"+decimalToBinary(decimal));
    }
}