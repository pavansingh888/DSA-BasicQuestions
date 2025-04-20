import java.util.Arrays;

//* O[nlogn] */
//* Pick pivot --> place it at correct position --> partition from(the index) that position and call quick sort for both left and right part of array. */]
//* i,j pointers to find larger from left and smaller from right and swap them. when i>j swap pivot and arr[j] */
public class Sort5_Quick {
    static int partition(int arr[],int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high-1 && arr[i]<=pivot){
              i++;
            }
            while(j>=low+1 && arr[j]>pivot){
              j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pIndex= partition(arr,low,high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }
    public static void main(String args[]){
        int arr[]={9, 4, 7, 6, 3, 1, 5};
        System.out.println("Unsorted: "+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted: "+Arrays.toString(arr));
    }
}
