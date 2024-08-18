public class Problem1 {

    
    static boolean palindrome(int n) {
       
        int revNum = 0;
       
        int dup = n;
        
        while (n > 0) {
            
            int ld = n % 10;
            
            revNum = (revNum * 10) + ld;
       
            n = n / 10;
        }
 
        if (dup == revNum) {
            
            return true;
        } else {
        
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 4554;

        if (palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}