/*
*https://www.geeksforgeeks.org/program-to-convert-a-given-number-to-words-set-2/
Write code to convert a given number into words.
Examples: 
Input: 438237764
Output: forty three crore eighty two lakh thirty seven thousand seven hundred and sixty four
Input: 999999
Output: nine lakh ninety nine thousand nine hundred and ninety nine
Input: 1000
Output: one thousand
Explanation: 1000 in words is “one thousand” */
//* 123456789 --> 12 crore - 34 lakh - 56 thousand - 7 hundred - 8 eighty - 9 nine */

public class Problem7_NumToWords {
    // strings at index 0 are not used, it is to make array
    // indexing simple
    String[] one = { "", "one ", "two ", "three ", "four ",
            "five ", "six ", "seven ", "eight ", "nine ",
            "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ",
            "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen " };

    // strings at index 0 and 1 are not used, they are to
    // make array indexing simple
    String[] ten = { "", "", "twenty ", "thirty ", "forty ",
            "fifty ", "sixty ", "seventy ", "eighty ", "ninety " };

    // Function to convert a given number into words.
    public String convertToWords(long n) {
        // stores word representation of given number n
        String output = "";

        // handles digits at ten millions and hundred
        // millions places (if any)
        output += numToWords((int)(n / 10000000), "crore ");

        // handles digits at hundred thousands and one
        // millions places (if any)
        output += numToWords(((int)(n / 100000) % 100), "lakh ");

        // handles digits at thousands and tens thousands
        // places (if any)
        output += numToWords(((int)(n / 1000) % 100), "thousand ");

        // handles digit at hundreds places (if any)
        output += numToWords(((int)(n / 100) % 10), "hundred ");

        if (n > 100 && n % 100 != 0) output += "and ";

        // handles digits at ones and tens places (if any)
        output += numToWords((int)(n % 100), "");

        return output;
    }

    // Helper function to convert a given number into words
    private String numToWords(int n, String s) {
        String str = "";
        // if n is more than 19, divide it
        if (n > 19)
            str += ten[n / 10] + one[n % 10];
        else
            str += one[n];

        // if n is non-zero
        if (n != 0) str += s;

        return str;
    }

    public static void main(String[] args) {
        Problem7_NumToWords solution = new Problem7_NumToWords();
        long n = 123456789;
        System.out.println(solution.convertToWords(n));
    }
}
