/*
 * Remove Duplicates From an Unsorted Array
Problem Statement: Given an unsorted array, remove duplicates from the array.
Examples:
Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}
Explanation: Removed all the duplicate elements
Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements
 */

import java.util.HashMap;

public class Problem12 {
     //*A-1 - Brute Force - O(n*n)+O(n) -  O(n) + O(n) */
    // public static void removeDuplicate(int arr[], int n){
    //     int mark[] = new int[n];
    //     //O[n]
    //     for(int i=0;i<n;i++){
    //         mark[i]=1;
    //     }
        
    //     //O[n^2]
    //     for(int i=0;i<n;i++){  
    //         if(mark[i]==1){
    //         for(int j=i+1;j<n;j++){
    //            if(arr[i]==arr[j]){
    //             mark[j]=0;
    //            }
    //         }
    //         }  
    //     }

    //     for(int i=0;i<n;i++){
    //         if(mark[i]==1){
    //             System.out.print(arr[i]+" ");
    //         }
    //     }
    // }

    //*A-2 - Hashtable Method */
    public static void removeDuplicate(int arr[], int n){
        HashMap<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<n;i++){
            if(!mp.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                mp.put(arr[i],1);
            }
        }
    }

    public static void main(String[] args) {
        // int arr[]={4,3,9,2,4,1,10,89,34};
        int arr[]={2,3,1,9,3,1,3,9};
        removeDuplicate(arr, arr.length);
    }
}
