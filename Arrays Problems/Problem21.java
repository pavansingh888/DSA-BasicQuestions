public class Problem21 {
    //* Brute - O(N^2) - O(1) */
    // public static int findEquilibriumIdx(int nums[], int n) {
    //     int leftSum, rightSum;
     
    //     for (int i = 0; i < n; i++) {
    //       leftSum = 0;
    //       for (int j = 0; j < i; j++) {
    //         leftSum += nums[j];
    //       }
    //       rightSum = 0;
    //       for (int j = i + 1; j < n; j++) {
    //         rightSum += nums[j];
    //       }
    //       if (leftSum == rightSum) {
    //         return i;
    //       }
    //     }
    //     return -1;
    //   }

    //* Using Total Sum O(N) - O(1)*/
    public static int findEquilibriumIdx(int nums[], int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
          totalSum += nums[i];
        }
        
        int sum=0;
        for (int i = 0; i < n; i++) {
            if(i>0){
              sum+=nums[i-1];  
            }
            if(totalSum-(sum+nums[i])==sum){
                return i;
            }
        }
        return -1;
        // int leftSum = 0, rightSum = totalSum;
        // for (int i = 0; i < n; i++) {
        //   rightSum -= nums[i];
        //   if (leftSum == rightSum) {
        //     return i;
        //   }
        //   leftSum += nums[i];
        // }
        // return -1;
      }
      public static void main(String[] args) {
        int n = 5;
        int nums[] = { 4, 8, 2, 3, -1};
        int equilibriumidx = findEquilibriumIdx(nums, n);
        System.out.println(equilibriumidx);
     
      }
}
