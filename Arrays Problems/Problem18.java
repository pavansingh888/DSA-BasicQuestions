/*Replace elements by its rank in the array


18

3
Replace elements by its rank in the array

Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.

Examples:

Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

Example 2:
Input: 1 5 8 15 8 25 9
Output: 1 2 3 5 3 6 4
Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so… */

import java.util.Set;
import java.util.HashSet;

import java.util.Arrays;
import java.util.HashMap;

public class Problem18 {
    //*Brute - 2 for loop - O(N^2) - O(N)  */
    // static void rankArray(int arr[],int n){
    //     for (int i = 0; i < n; i++) {
    //         Set<Integer> s=new HashSet<Integer>();
    //         for (int j = 0; j < n; j++) {
    //             if(arr[j]<arr[i]){
    //               s.add(arr[j]);
    //             }
    //         }
    //         int rank=s.size()+1;
    //         System.out.print(rank+" ");
    //     }
    // }

    //*Optimized - n+nlogn+n+n : n+nlogn - O(2N)  */

    static void rankArray(int arr[],int n){
        int temp=1;
        int copy[]=new int[arr.length];
       
        for (int i = 0; i < arr.length; i++) {
            copy[i]=arr[i];
        } //n

        Arrays.sort(copy); //nlogn

        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for (int i = 0; i < n; i++) {
            if(mp.get(copy[i])==null){
                mp.put(copy[i],temp);
                temp++;
            }
        }//n
        
        for (int i = 0; i < copy.length; i++) {
            System.out.print(mp.get(arr[i])+" ");
        }//n

    }
    public static void main(String args[]){
        int arr[]={20,15,26,2,98,6};
        rankArray(arr,arr.length);
    }
}
