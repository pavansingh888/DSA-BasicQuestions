//*Brute force -  O(n^2) - O(n) */

import java.util.*;
public class Problem19a {

  // Function to swap elements
  public static void swap(int[][] arr, int i, int j) {
    int temp=arr[0][i];
    arr[0][i]=arr[0][j];
    arr[0][j]=temp;

    temp=arr[1][i];
    arr[1][i]=arr[1][j];
    arr[1][j]=temp;
  }

  // Function to sort 2d array by frequency
  public static void sort2darray(int[][] array2d, int k) {
    for(int i=0;i<k-1;i++)
    for(int j=0;j<k-1-i;j++){
      if(array2d[1][j]<array2d[1][j+1]){
        swap(array2d, j, j+1);
      }
    }
  }
  
  // Function to sort elements of array by frequency
  public static void Sortele(int[] arr, int n) {
    // Step 1: Sort the array
    Arrays.sort(arr,0,n);

    // Step 2: Create a 2d array
    int arr2d[][]=new int[2][100];
    int count=0;
    int k=0;
    for (int i = 0; i < n; i++) {
      if(i==0){
        arr2d[0][k]=arr[0];
        count++;
      }else if(arr2d[0][k]==arr[i]){
       count++;
      }else {
       arr2d[1][k]=count;
       k++;
       arr2d[0][k]=arr[i];
       count=1;
      }
    }
    arr2d[1][k]=count;
    k++;
    // for (int i = 0; i<2; i++) {
    //   for (int j = 0; j<4; j++) {
    //       System.out.print(arr2d[i][j]+" ");
    //   }
    //   System.out.println();
    //   } 

    // Step 3: sort the 2d array according to frequency
    sort2darray(arr2d, k);  

    // for (int i = 0; i<2; i++) {
    //   for (int j = 0; j<4; j++) {
    //       System.out.print(arr2d[i][j]+" ");
    //   }
    //   System.out.println();
    //   }

    // Step 4: Store the answer in original array
    int i=0, m=0;
    while(i<k){
      while(arr2d[1][i]>0){
        arr[m]=arr2d[0][i];
        arr2d[1][i]--;
        m++;
      }
      i++;
    }
  }
  
  public static void main(String args[]) {
    int n = 6;
    // int[] arr = {1,2,3,2,4,3,1,2};
    int[] arr = {199,6,3,199,3,5};
    Sortele(arr, n);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}