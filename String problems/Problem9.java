public class Problem9 {
    
    static int findSum(String str){
        int sum=0;
        String tempSum="0";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){ //*LEARN */
               tempSum+=str.charAt(i);
            }else{
               sum+=Integer.parseInt(tempSum);
               tempSum="0";
            }
        }

        System.out.println(Integer.parseInt("23"));
        // System.out.println(Integer.parseInt("23a")); //java.lang.NumberFormatException: For input string: "23a"
        return sum+Integer.parseInt(tempSum); //*LEARN */
    }
    public static void main(String[] args) {
        String s="1bc268";
        System.out.println(findSum(s));
    }
}
