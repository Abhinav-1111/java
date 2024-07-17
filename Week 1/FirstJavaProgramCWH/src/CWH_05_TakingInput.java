import java.util.Scanner;
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1 : ");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter Number2 : ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
//        int Sum = a + b;
        float Sum = a + b;
        System.out.println("The sum of these numbers are ; ");
        System.out.println(Sum);

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

//        String str = sc.nextLine();
//        System.out.println(str);
    }
}
