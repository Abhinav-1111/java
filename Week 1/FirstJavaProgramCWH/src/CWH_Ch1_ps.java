// Write a program to sum three numbers in java

import java.util.Scanner;
public class CWH_Ch1_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 :");
        float number1 = sc.nextFloat();
        System.out.println("Enter number2 :");
        float number2 = sc.nextFloat();
        System.out.println("Enter number3 :");
        float number3 = sc.nextFloat();

        float total = number1 + number2 + number3;

        System.out.println("The sum of three numbers is : " + total);
    }
}
