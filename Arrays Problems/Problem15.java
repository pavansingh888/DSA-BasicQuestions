/*
Find all the non-repeating elements in an array
Problem Statement: Find all the non-repeating elements for a given array. Outputs can be in any order.
Examples:
Example 1:
Input:
 Nums = [1,2,-1,1,3,1]
Output:
 2,-1,3
Explanation:
 1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.
Example 2:
Input:
 Nums = [1,2,3]
Output:
 1,2,3
Explanation:
 All elements present in the array occur once. Hence, every element is non-repeating. */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem15 {
    //*Brute -  O(N2) - O(1) */
    // static void findNonRepeatingElement(int arr[]){
    //       boolean chk;
    //     for (int i = 0; i < arr.length; i++) {
    //         chk=false;
    //         for (int j = 0; j < arr.length; j++) {
    //             if(i!=j && arr[i]==arr[j]){
    //                 chk=true;
    //                 break;
    //             }
    //         }
    //         if(!chk){
    //             System.out.print(arr[i]+" ");
    //         }
    //     }
    // }
   //*Array sorting O(NlogN)+O(N) - O(n) */
//     static void findNonRepeatingElement(int arr[]){
//         Arrays.sort(arr);
     
//         if(arr[0]!=arr[1]) System.out.print(arr[0]+" ");

//         for (int i = 1; i < arr.length-1; i++) {
//             if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) System.out.print(arr[i]+" ");
//         }

//         if(arr[arr.length-1]!=arr[arr.length-2]) System.out.print(arr[arr.length-1]);
//   }


  //*Using maps  O[n] - O[n] */
  static void findNonRepeatingElement(int arr[]){
    Map<Integer,Integer> mp=new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        if(mp.get(arr[i])==null){
            mp.put(arr[i],1);
        }else{
            mp.put(arr[i],mp.get(arr[i])+1);
        }
    }

    for (Entry<Integer,Integer> entry:mp.entrySet()) {
        if(entry.getValue()==1) System.out.print(entry.getKey()+" ");
    }
  }

    public static void main(String[] args) {
        int nums[] = {1,2,-1,1,3,1};
		System.out.println("Non-repeating numbers are: ");
		findNonRepeatingElement(nums);
    }
}
