/*
 * Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

Examples
Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]

Explanation:
 Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2:
Input:
 arr[1,1,1,2,2,3,3,3,3,4,4]

Output:
 arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation:
 Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
 */

import java.util.* ;

public class Problem11{

public static int removeDuplicate(int arr[],int n){
    int ptr=1;
    for(int i=1;i<n;i++){
        if(arr[i]!=arr[i-1]){
          arr[ptr]=arr[i];
            ptr++;
        }
    }
    return ptr;
}
    public static void main(String args[]){
      int arr[]={1,1,1,2,2,3,3,3,3,4,4};
      int n=arr.length;
      System.out.println(removeDuplicate(arr,n));
      System.out.println(Arrays.toString(arr));

    }
}