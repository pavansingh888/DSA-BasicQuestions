/*
 *Left rotate an array by D places
Problem Statement: Given an array of N integers and an integer D, left rotate the array by D place.

Pre-requisite: Left Rotate the Array by One

Examples:
Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , d = 3
Output: 4 5 6 7 1 2 3
Explanation: The array is rotated to the left by 3 positions.

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , d = 2 
Output: 8 9 10 11 3 7
Explanation: The array is rotated to the left by 2 positions.
*/

import java.util.Arrays;

class Problem8 {
    //*Brute force O[n+d]  - O[d] */
    static void leftRotate(int arr[],int n,int d){
       
        d=d%n;
        if(d==0 || n==0)
       return;
    
       

       int temp[] = new int[d];
       for (int i = 0; i < d; i++) {
        temp[i]=arr[i];
       }

       for (int i = 0; i < n-d; i++) {
        arr[i]=arr[i+d];
       }

       for (int i = 0; i < d; i++) {
        arr[n-d+i]=temp[i];
       }

    }

    //*right rotate */
    static void rightRotate(int arr[], int n, int d) {

        if (n == 0) return;

        // Get the effective number of rotations:
        d = d % n;

        // checking if d is a multiple of n:
        if (d == 0) return;

        int temp[] = new int[d]; // temporary array

        //step 1: Copying last d elements
        // in the temporary array:
        for (int i = 0; i < d; i++) {
            temp[i] = arr[n-d+i];
        }

        // step 2: Shift first (n-d) elements
        // to the right by d places in the given array:
        for (int i = n-d-1 ; i >= 0 ; i--) {
            arr[i + d] = arr[i];
        }

        //step 3: Place the elements of the temporary
        // array in the first d places of the given array:
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }

    //*Optimized Approach(without using any extra space): Using “Reversal Algorithm”  O(d)+O(n-d)+O(n) = O(2*n)  -  O(1) */
/* 
    if (n == 0) return;

        Get the effective number of rotations:
        d = d % n;
        step 1:
        reverse(arr, 0, d - 1);
        step 2:
        reverse(arr, d, n - 1);
        step 3:
        reverse(arr, 0, n - 1);
 */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=25; //d=4
        // leftRotate(arr,arr.length,d);
        rightRotate(arr, arr.length, d);
        System.out.println(Arrays.toString(arr));
    }
}
