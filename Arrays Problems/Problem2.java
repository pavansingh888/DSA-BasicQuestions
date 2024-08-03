/*Problem Statement: Given an array, we have to find the largest element in the array.

Examples
Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array.
  */
/**
 * Problem2
 */
public class Problem2 {
    static void largestElement(int arr[]){
        int largest=arr[0];
        
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]>largest){
            largest = arr[i];
          }
        }
    
        System.out.println(largest);
      }
    
      public static void main(String[] args) {
          int arr[] = {22,11,51,21,20,10};
          largestElement(arr);
      }
    
}
