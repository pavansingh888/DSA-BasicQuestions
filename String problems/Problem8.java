public class Problem8 {
    static String solve(String str){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='(' && str.charAt(i)!=')'){
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {

        String input1 = "a+((b-c)+d)";
        String input2 = "(((a-b))+c)";
    
        System.out.println("Original String: "+input1);
        System.out.println("After removing brackets: "+solve(input1));
        System.out.println("Original String: "+input2);
        System.out.println("After removing brackets: "+solve(input2));
        
      }
}
