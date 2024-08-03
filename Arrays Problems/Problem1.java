/* 
Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.
 */

// import java.util.Arrays;

public class Problem1 {
    //*Approach 1 - O[nlogn] - TimSort makes use of the Insertion sort and the MergeSort algorithms */
    // static void smallestElement(int arr[]){
    //    Arrays.sort(arr);
    //    System.out.println(arr[0]);
    // }

    //* Approach 2 - O[n] */
 static void smallestElement(int arr[]){
      int smallest=arr[0];
      
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]<smallest){
            smallest = arr[i];
        }
      }

      System.out.println(smallest);
    }

    public static void main(String[] args) {
        int arr[] = {22,11,51,21,20,10};
        smallestElement(arr);
    }
    
 }