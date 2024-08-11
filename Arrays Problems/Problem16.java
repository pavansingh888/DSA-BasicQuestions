/*
 * Find all Symmetric Pairs in the array of pairs
In this article, we will solve the problem: "Find all Symmetric Pairs in the array of pairs"
Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.
Examples:
Example 1:
Input: (1,2),(2,1),(3,4),(4,5),(5,4)
Output: (2,1) (5,4)
Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.
Example 2:
Input: (1,5),(2,3),(4,2),(5,1),(2,4)
Output: (2,4) (5,1)
Explanation: Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.
 */
import java.util.HashMap;
public class Problem16 {
    //*Brute - O(N*N) - O(1)
    // public static void main(String[] args) {
    //     int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){

    //         for(int j=i+1;j<n;j++){
    //             if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
    //                 System.out.println("("+arr[j][0]+","+arr[j][1]+")");
    //                 break;
    //             }
    //         }
    //     }
    // }

    //*Time optimized O[n] - O[n] */
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        HashMap<Integer,Integer> mp= new HashMap<>();
        int first, second;
        int n=arr.length;
        for(int i=0;i<n;i++){
            first=arr[i][0];
            second=arr[i][1];
           if(mp.get(second)!=null && mp.get(second)==first){
            System.out.println("("+first+","+second+")");
           }else{
            mp.put(first,second);
           }
        }
    }

}
