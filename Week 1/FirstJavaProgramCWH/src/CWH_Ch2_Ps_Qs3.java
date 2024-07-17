// Use comparison operators to find out whether a given number is greater than the user entered or not?

import java.util.Scanner;

public class CWH_Ch2_Ps_Qs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 100;
        System.out.println("Enter a number : ");
        int num2 = sc.nextInt();

        System.out.println(num1 >= num2);
    }
}
