import java.util.Arrays;
public class Sort1_Bubble {
    static void bubbleSort(int arr[],int n){
        
       for(int i=1;i<n-1;i++){
        boolean swap=false;
        for(int j=0;j<n-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=true;
            }
        }
        if(swap==false) break;
       }
    }
    public static void main(String args[]){
        int arr[]={7, 4, 1, 5, 3};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));;
    }
}
