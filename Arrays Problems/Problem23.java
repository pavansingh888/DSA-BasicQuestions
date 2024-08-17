/*
 * Given two arrays A1[] and A2[], sort A1 in such a way that the relative order among the elements will be same as those are in A2. For the elements not present in A2, append them at last in sorted order. 
Example: 
Input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
       A2[] = {2, 1, 8, 3}
Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}
The code should handle all cases like the number of elements in A2[] may be more or less compared to A1[]. A2[] may have some elements which may not be there in A1[] and vice versa is also possible.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
public class Problem23 {
    static void sorta1bya2(int a1[],int n1,int a2[],int n2,int ans[]){
        Map<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<n1;i++){
            mp.put(a1[i],mp.getOrDefault(a1[i],0)+1);
        }

        int ind=0;

        for(int i=0;i<n2;i++){
            if(mp.containsKey(a2[i])){
                for(int j=1;j<=mp.get(a2[i]);j++){
                    ans[ind++]=a2[i];
                }
                mp.remove(a2[i]);
            }
        }

        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            for(int j=1;j<=entry.getValue();j++){
                ans[ind++]=entry.getKey();
            }
        }

        System.out.println(Arrays.toString(ans));
    }
    public static void main(String args[]){
        int a1[]={2,1,2,5,7,1,9,3,6,8,8};
        int a2[]={2,1,8,3};

        int ans[]=new int[a1.length];
        sorta1bya2(a1,a1.length,a2,a2.length,ans);
    }
}
