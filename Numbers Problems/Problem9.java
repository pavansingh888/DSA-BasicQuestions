//*Sum of first N Natural Numbers */
public class Problem9 {
    /*
    *Parameterised way - O(N)
void func(i,sum)
{
   if(i<1)
   {
     print(sum);
     return;
   }
func(i-1,sum+i);
}
main()
{
   input(n);
   func(n,0);
}
*/

//*functional way O(N) */
static int func(int n){
        
    // Base Condition.
    if(n == 0){
        return 0;
    }
    
    // Problem broken down into 2 parts and then combined.
    return n + func(n-1);
    

}
public static void main(String[] args) {

int n = 3;
System.out.println(func(n));
}
}
