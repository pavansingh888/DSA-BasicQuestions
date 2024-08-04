/*
Problem Statement: You are given an array. The task is to reverse the array and print it. 

Examples:

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on. */

import java.util.Arrays;
import java.util.Collections;

public class Problem4 {
    // * A-1 -  While or for loop for n/2 traversal. O[n]
    //DIY
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
        }
     }

     static void printArray(Integer arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
        }
     }

     // * A-2 - Recursive method  O[n]
    //  static void reverseArray(int arr[], int start, int end) {
    //     if (start < end) {
    //        int tmp = arr[start];
    //        arr[start] = arr[end];
    //        arr[end] = tmp;
    //        reverseArray(arr, start + 1, end - 1);
    //     }
    //  }

    //* A-3 - Using library function (New Approach) - O[n] */
/*Note:

Since this method expects an object as a parameter we have to convert the array into a list object using asList().
Java collections require wrapper classes instead of primitive data types. In order to reverse an integer array use Integer instead of int.
Syntax: Collections.reverse(class_obj);  */
 static void reverseArray(Integer arr[]) {
      //fetching array as list object
      //reversing the fetched object
      Collections.reverse(Arrays.asList(arr));
   }

     public static void main(String[] args) {
        int n = 5;
        Integer arr[] = { 5, 4, 3, 2, 1};
        // reverseArray(arr, 0, n - 1);
        reverseArray(arr);
        printArray(arr, n);
     }
}
