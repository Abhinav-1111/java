//Write a program which ask the user to enter his/her name greets them with  "Hello <name>, Have a good day" text

import java.util.Scanner;
public class CWH_Ch1_Ps_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", Have a good day.");
    }
}
