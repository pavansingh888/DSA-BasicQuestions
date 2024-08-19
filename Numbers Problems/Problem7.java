public class Problem7 {

  public static void main(String[] args) {

    int n = 8;
    if (solve(n) == 0) {
      System.out.println(n + " is even.");
    } else {
      System.out.println(n + " is odd.");
    }
  }
  public static int solve(int n) {
    if ((n & 1) == 0)
      return 0;
    else
      return 1;
  }
}