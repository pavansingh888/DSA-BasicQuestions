/*
 * Find all repeating elements in an array
Problem Statement: Find all the repeating elements present in an array.
Examples:
Example 1:
Input: 
Arr[] = [1,1,2,3,4,4,5,2]
Output:
 1,2,4
Explanation:
 1,2 and 4 are the elements which are occurring more than once.
Example 2:
Input:
 Arr[] = [1,1,0]
Output:
 1
Explanation:
 Only 1 is occurring more than once in the given array.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Problem14 {
    //*Brute solution O[n]+O[n^2] - O[n] */
    // static void printDuplicate(int arr[], int n){
        
    //     boolean checked[] = new boolean[n];
    //     for (int i = 0; i < checked.length; i++) {
    //         checked[i]=false;
    //     }

    //     for (int i = 0; i < n; i++) {
    //         if (!checked[i]) {
    //             for (int j = i+1; j < n; j++) {
    //                 if(arr[j]==arr[i] && checked[i]==false){
    //                     System.out.print(arr[i]+" ");
    //                     checked[i]=true;
    //                     checked[j]=true;
    //                 }else if(arr[j]==arr[i]){
    //                     checked[j]=true;
    //                 }
    //             }
    //         }
    //     }

    // }

    //*Using Array sort O(NlogN)+O(N) */
    //  static void printDuplicate(int arr[], int n){
    //     Arrays.sort(arr);

    //     for (int i = 0; i < n-1; i++) {
    //         if(arr[i] == arr[i+1])
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    //*Using Hashmap O(N) - O(N) */
     static void printDuplicate(int arr[], int n){
        Map<Integer,Integer> mp= new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(mp.get(arr[i])==null){
                mp.put(arr[i], 1);
            }else {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
        }

        for (Entry<Integer,Integer> entry: mp.entrySet()) {
            if (entry.getValue()>1) {
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String arg[]){
        int[] arr = {1,4,1,3,1,3,5,5,2,3}; //1 2 4 3 
        printDuplicate(arr,arr.length);
    }
}
