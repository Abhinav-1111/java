import java.util.Scanner;

public class CWH_Ch4_Ps_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics marks: ");
        int Physics = sc.nextInt();
        System.out.println("Enter Chemistry marks: ");
        int Chemistry = sc.nextInt();
        System.out.println("Enter Mathematics marks: ");
        int Mathematics = sc.nextInt();

        int total = Physics + Chemistry + Mathematics;
        System.out.println("Total Marks: " + total);

        int percentage = ((Physics + Chemistry + Mathematics) * 100) /300;
        System.out.println("The percentage of this student is " + percentage + "%");

        if (percentage >=40 && Physics >= 33 && Chemistry >= 33 && Mathematics >= 33){
            System.out.println("Congratulation!, You are passed.");
        }
        else {
            System.out.println("Sorry, you have to attempt it again");
        }
    }
}
