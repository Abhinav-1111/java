// Write a program to detect whether a number entered by the user is integer or not

import java.util.Scanner;
public class CWH_Ch1_Ps_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        System.out.println(sc.hasNextInt());
    }
}
