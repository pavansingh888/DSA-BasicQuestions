//*Check whether a number is positive or negative
/*
 * Why the trailing values are replaced by 1 instead of 0?

This happens because Java performs a signed right shift (>>), which fills the leftmost bits with the sign bit to maintain the number's sign. For negative numbers, the sign bit is 1, so shifting fills the leftmost bits with 1.
If you want to avoid sign extension (i.e., fill with 0), you should use the unsigned right shift (>>>) operator.
 */
public class Problem8 {

    public static void main(String[] args) {
  
      int n = 5;
      check(n);
      n = -6;
      check(n);
    }
    public static void check(int n) {
     if (n >> 31 == 0) {
        System.out.println(n + " is positive.");
      } else if (n >> 31 == -1) {
        System.out.println(n + " is negative.");
      }
  
  }
  }

