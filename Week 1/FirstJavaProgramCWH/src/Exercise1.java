import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mathematics subject Marks : ");
        float Mathematics = sc.nextFloat();
        System.out.println("Enter Physics subject Marks : ");
        float Physics = sc.nextFloat();
        System.out.println("Enter Chemistry subject Marks : ");
        float Chemistry = sc.nextFloat();
        System.out.println("Enter English subject Marks : ");
        float English = sc.nextFloat();
        System.out.println("Enter Music subject Marks : ");
        float Music = sc.nextFloat();

        float total = (Mathematics + Physics + Chemistry + English + Music)*100 / 500;

        System.out.println("The Percentage of this student is " + total + "%");
    }
}
