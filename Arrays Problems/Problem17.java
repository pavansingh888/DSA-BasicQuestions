/*
 * Maximum Product Subarray in an Array
Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.
Examples
Example 1:
Input:
 Nums = [1,2,3,4,5,0]
Output:
 120
Explanation:
 In the given array, we can see 1×2×3×4×5 gives maximum product value.
Example 2:
Input:
 Nums = [1,2,-3,0,-4,-5]
Output:
 20
Explanation:
 In the given array, we can see (-4)×(-5) gives maximum product value.
 */


 public class Problem17{
     //*Brute O[n^3] - 3 for loop */

     //*Better O[n^2] - O[1] */
    // static int maxProductSubArray(int arr[],int n){
    //  int maxProduct = Integer.MIN_VALUE;
    //  for (int i = 0; i < n; i++) {
    //     int product=1;
    //     for (int j = i; j < n; j++) {
    //         product=product*arr[j];
    //         if(product>maxProduct){
    //             maxProduct=Math.max(product, maxProduct);
    //         }
    //     }
    //  }

    //  return maxProduct;
    // }

    //* Optimal Intuitive soulution - O[n] - O[1] prefer this over Kadane's Algo*/
    // static int maxProductSubArray(int arr[],int n){
    //     int maxProduct = Integer.MIN_VALUE;
    //     int pre=1,suff=1;
    //     for (int i = 0; i < n; i++) {
    //        if(pre==0) pre=1;
    //        if(suff==0) suff=1;
    //        pre=pre*arr[i];
    //        suff=suff*arr[n-1-i];
    //        maxProduct=Math.max(maxProduct, Math.max(pre, suff));
    //     }
   
    //     return maxProduct;
    //    }

    //* Optimal Kadane Algo - O[n] - O[1] */
   //Not prefferred


    public static void main(String[] args) {
        int arr[]={3, 2, -1, 4, -6, 3, -2, 6};
        // int arr[]={1,2,-3,0,-4,-5};
        int n = arr.length;
        System.out.println(maxProductSubArray(arr, n));
    }
 }
