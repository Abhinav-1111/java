import java.util.Scanner;

public class CWH_Ch4_Ps_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day : ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Today is Sunday");
            case 2 -> System.out.println("Today is Monday");
            case 3 -> System.out.println("Today is Tuesday");
            case 4 -> System.out.println("Today is Wednesday");
            case 5 -> System.out.println("Today is Thursday");
            case 6 -> System.out.println("Today is Friday");
            case 7 -> System.out.println("Today is Saturday");
            default -> System.out.println("Invalid");
        }
    }
}
