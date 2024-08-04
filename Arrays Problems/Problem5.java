/*Problem statement: Given an array, we have found the number of occurrences of each element in the array.

Examples:

Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	     5  2
        15  1
Explanation: 10 occurs 3 times in the array
	         5 occurs 2 times in the array
             15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array
*/

import java.util.HashMap;
import java.util.Map;

public class Problem5 {

    // * A-1 - Using 2 loops
    static void countFrequency(int arr[], int n){
        boolean visited[] = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if(visited[i]==true)
            continue;

            int count=1;
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }

            System.out.println(arr[i]+","+count);
        }
    }

    // * A-2 - Using Map(HashMap)
    /*What is a Map?
      A Map is an object that maps keys to values.
      A Map cannot contain duplicate keys; each key can map to at most one value.

    What is a HashMap?
      HashMap is a part of Java's collection framework and implements the Map interface.
      It uses a hash table to store the map's entries.
      It allows null values and the null key.
      It provides constant-time performance (O(1)) for basic operations like get and put, assuming the hash function disperses the elements properly among the buckets.

    map.entrySet() returns a Set of Map.Entry objects.
    Each Map.Entry object represents a key-value pair in the HashMap.

    Map.Entry is a nested interface within the Map interface. It represents a single key-value pair (an entry) in a map.
     */
    static void countFrequencyMap(int arr[], int n){
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
            System.out.println(map.entrySet()); //[5=2, 10=3, 15=1]
        }
    }

    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5};
        int n= arr.length;
        // countFrequency(arr,n);
        countFrequencyMap(arr, n);
    }
}
