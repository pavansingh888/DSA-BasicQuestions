import java.util.Arrays;

public class Sort2_Selection {
    static void bubbleSort(int arr[],int n){
   
       for(int i=0;i<n-1;i++){
        int minPos=i;
        for(int j=i+1;j<n;j++){
           if(arr[j]<arr[minPos]){
                minPos=j;
            }
        }
        if(minPos!=i){
            int temp=arr[minPos];
                arr[minPos]=arr[i];
                arr[i]=temp;
        }
       }
    }
    public static void main(String args[]){
        int arr[]={7, 4, 1, 5, 3};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));;
    }
}
