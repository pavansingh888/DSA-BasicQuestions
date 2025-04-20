import java.util.Arrays;

public class Sort3_Insertion {
    static void insertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }
    public static void main(String args[]){
        int arr[]={7, 4, 1, 5, 3};
        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
