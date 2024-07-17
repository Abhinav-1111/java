// Q4. Write a program to detect the double and triple spaces in a string

public class CWH_Ch3_Ps_Q4 {
    public static void main(String[] args) {
        String letter = "This is java  course,   Thanks";
        System.out.println(letter.indexOf("  "));
        System.out.println(letter.indexOf("   "));
    }
}
