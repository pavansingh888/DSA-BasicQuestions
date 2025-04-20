public class Problem1 {
    //*AP - 1 Using while loop - O[n] - O[1] */
    //   static boolean isPalindrome(String s){
    //     int left=0, right=s.length()-1;
    //     while(left<right){
    //         char l=s.charAt(left), r=s.charAt(right);
    //         if(!Character.isLetterOrDigit(l)){
    //            left++;
    //         }else if(!Character.isLetterOrDigit(r)){
    //             right--;
    //         }else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
    //             return false;
    //         }else {
    //             left++;
    //             right--;
    //         }
    //     }
    //     return true;
    //   }

      //*AP - 1 Recursive approach - O[n] - O[1] */
      static boolean isPalindrome(int i,String s){
        if(i>=s.length()/2) return true;
        if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(s.length()-1-i))){
                return false;
            }
        
        return isPalindrome(i+1,s);
      }
    public static void main(String args[]){
        String str= "AbcDCB";
        if(isPalindrome(0,str)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}
