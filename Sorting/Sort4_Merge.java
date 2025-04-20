import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


//* O[nlogn] */
//* Divide - MergeSort both part - Merge both part using temp array */
//* Divide by 2 --> call mergeSort for left and right part to get 2 mergeSorted array --> now merge these array using temporary array. */
public class Sort4_Merge{
    static void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        List<Integer> temp=new ArrayList<>();
        
        while(left<=mid && right<=high){
           if(arr[left]<=arr[right]){
            temp.add(arr[left++]);
           }else{
            temp.add(arr[right++]);
           }
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    static void mergeSort(int arr[],int low,int high){
        if(low>=high) return;
        int mid=low+ (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void main(String args[]){
        int arr[]={9, 4, 7, 6, 3, 1, 5};
        System.out.println("Unsorted :"+Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted :"+Arrays.toString(arr));
    }
}