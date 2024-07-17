//Write a program to calculate CGPA using Marks of three Subjects(Out of 100)

import java.util.Scanner;

public class CWH_Ch1_Ps_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject1 subject Marks : ");
        float Subject1 = sc.nextFloat();
        System.out.println("Enter Subject2 subject Marks : ");
        float Subject2 = sc.nextFloat();
        System.out.println("Enter Subject3 subject Marks : ");
        float Subject3 = sc.nextFloat();

        float marks = Subject1 + Subject2 + Subject3;
        System.out.println("The Marks of this student is " + marks);

        float percentage = (Subject1 + Subject2 + Subject3 )*100 / 300;

        System.out.println("The Percentage of this student is " + percentage + "%");

        float cgpa = percentage/10;
        System.out.println("The CGPA of this student is " + cgpa);

    }
}
