// Write a program to convert Kilometers to miles

import java.util.Scanner;
public class CWH_Ch1_Ps_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Kilometers : ");
        float km = sc.nextFloat();

        double miles = (km/1.609);
        System.out.println("miles = " + miles);

    }
}
